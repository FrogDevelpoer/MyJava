package ch12_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile implements Runnable{
    @Override
    public void run() {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        String filename = pathname + "news.txt";

        File file = new File(filename);

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String imsi ="";
            while((imsi = br.readLine()) != null){
                Thread.sleep(5000);
                System.out.println(imsi);
            }

            System.out.println("파일 읽기 완료");
        }
        catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("기타 예외 발생");
            e.printStackTrace();
        }
        finally {
            try{
                if(br != null){br.close();}
                if(fr != null){fr.close();}
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
