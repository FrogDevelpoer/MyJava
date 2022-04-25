package ch12_stream;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;

public class MakeFile extends Thread{
    @Override
    public void run() {
        try{
            String pathname = System.getProperty("user.dir") + "\\src\\data\\";
            File dir = new File(pathname);
            DecimalFormat df = new DecimalFormat("00");

            if(dir.isDirectory()){
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(3000);
                    Calendar cal = Calendar.getInstance();

                    int minute = cal.get(Calendar.MINUTE);
                    int second = cal.get(Calendar.SECOND);

                    String fname = df.format(minute) + "분 " + df.format(second) + "초";
                    String filename = "somefile" + fname + ".txt";

                    File myfile = new File(dir, filename);
                    boolean bool = myfile.createNewFile();
                    if(bool == true){
                        System.out.println("파일"  + filename + " 생성완료");
                    }
                }
            }
            System.out.println("파일 생성 완료");
        }
        catch (InterruptedException e){
            System.out.println("쓰레드 인터럽트 예외 발생");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("입출력 예외 발생");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("기타 예외 발생");
            e.printStackTrace();
        }
        finally {

        }
    }
}
