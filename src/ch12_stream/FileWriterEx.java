package ch12_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        // 폴더 구분자는 슬래시는 1개, 역슬래시는 2개로 작성
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        System.out.println(pathname);

        String filename = pathname + "jumsu.txt";
        System.out.println(filename);

        File target = new File(filename);   // 파일이나 폴더를 객체로 만들어주는 클래스

        FileWriter fw = null;   // 주 스트림
        BufferedWriter bw = null; // 보조 스트림

        System.out.println("파일을 기록 중 입니다.");
        try {
            fw = new FileWriter(target);
            bw = new BufferedWriter(fw); // bw 객체에는 파일기록과 관련된 메소드들 구비되어있음

            bw.write("뿅뺭, 60.0, 70.0, 80.0, M");
            bw.newLine();
            bw.write("뿅뺭, 60.0, 70.0, 80.0, M");
            bw.newLine();
            bw.write("뿅뺭, 60.0, 70.0, 80.0, M");
            bw.newLine();
            bw.write("뿅뺭, 60.0, 70.0, 80.0, M");
            System.out.println("파일을 기록 종료");
        } catch (IOException e) {
            System.out.println("입출력 예외 발생.");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("기타 예외 발생.");
            e.printStackTrace();
        }
        finally {
            try {
                if(bw != null){bw.close();}
                if(fw != null){fw.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
