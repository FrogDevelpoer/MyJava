package ch12_stream;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        String filename = pathname + "jumsu.txt";
        System.out.println(filename);

        File source = new File(filename);

        FileReader fr = null;
        BufferedReader br = null;

        try {
            System.out.println("파일을 읽어오는중.");
            fr = new FileReader(source);
            br = new BufferedReader(fr);

            int cnt = 0;
            String imsi = "";
            while((imsi = br.readLine()) != null){
                cnt += 1;
                System.out.println(cnt + "번째 줄 : " + imsi);
            }
            System.out.println("파일을 읽어오기 완료.");
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않습니다.");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("입출력 예외 발생.");
            e.printStackTrace();
        }
        finally {
                try {
                    if(br != null){br.close();}
                    if(fr != null){fr.close();}
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
