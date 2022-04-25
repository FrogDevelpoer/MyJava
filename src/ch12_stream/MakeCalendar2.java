package ch12_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Calendar;

public class MakeCalendar2 {
    public MakeCalendar2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            MakeCal(arr[i]);
        }
    }
    // 각 월별로 달력을 만들어서 해당 텍스트 파일에 기록.
    // 매개 변수 mycalendar 예시 : 202108
    private void MakeCal(String mycalendar) {
        Calendar cal = Calendar.getInstance();
        int year = Integer.parseInt(mycalendar.substring(0, 4));
        int month = Integer.parseInt(mycalendar.substring(4));
        int day = 1;
        cal.set(year, month - 1, day);

        int lastday = cal.getActualMaximum(Calendar.DATE);
        int weekconst = cal.get(Calendar.DAY_OF_WEEK);

        // 파일 이름 예시 : [2021년 8월.txt]
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        String filename = pathname + year + "년 " + new DecimalFormat("00").format(month);
        filename += "월.txt";
        System.out.println(filename);

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(new File(filename)));
            bw.write(mycalendar + "달력 출력");
            bw.newLine();

            String tabstr = ""; // 탭 관련 문자열
            for (int i = 1; i < weekconst; i++) {
                tabstr += "\t";
            }
            bw.write(tabstr);

            for (int i = 1; i <= lastday ; i++) {
                bw.write(i + "\t");

                if(weekconst == 7){ // 7이 되면 엔터키 한번 누르기
                    bw.newLine();
                    weekconst = 0;
                }
                weekconst++;
            }
            System.out.println("[" + filename + "] 파일 작성 완료");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(bw != null){bw.close();}
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
