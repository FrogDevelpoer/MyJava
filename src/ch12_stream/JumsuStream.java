package ch12_stream;

import java.io.*;
import java.text.DecimalFormat;

public class JumsuStream {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        String source = pathname + "jumsu.txt";
        String target = pathname + "result.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            br = new BufferedReader(new FileReader(new File(source)));
            bw = new BufferedWriter(new FileWriter(new File(target)));

            String temp = "";

            while((temp = br.readLine()) != null){
                String result = makeStr(temp);
                bw.write(result);
                bw.newLine();
            }
            System.out.println("작업 완료");
        }
        catch(FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("입출력 예외 발생");
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("기타 예외 발생");
            e.printStackTrace();
        }
        finally{
            try{
                if(br != null){br.close();}
                if(bw != null){bw.close();}
            }
            catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }

    private static String makeStr(String temp) {
        String [] arr = temp.split(", ");

        String name = arr[0];
        double kor = Double.parseDouble(arr[1]);
        double eng = Double.parseDouble(arr[2]);
        double math = Double.parseDouble(arr[3]);
        String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자";

        double _total = kor + eng + math;
        double _avg = _total / 3;

        double imsi = 12.3;
        String pattern = "###.0";

        DecimalFormat df = new DecimalFormat(pattern);

        String total = df.format(_total);
        String avg = df.format(_avg);

        String result = name + "/" + gender + "/" + total + "/" + avg;
        return result;
    }
}
