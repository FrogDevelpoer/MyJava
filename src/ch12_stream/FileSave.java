package ch12_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
    public static void main(String[] args) {
        String win_folder = "c:\\windows\\";
        File target = new File(win_folder);

        File[] filelists = target.listFiles();

        System.out.println("목록 개수 : " + filelists.length);

        String pathname = System.getProperty("user.dir") + "\\src\\data";
        String filename1 = pathname + "file.txt"; // 파일일 목록을 저장 파일
        String filename2 = pathname + "folder.txt"; // 폴더 목록을 저장할 파일

        // File을 위한 Writer 객체
        FileWriter fw1 = null;
        BufferedWriter bw1 = null;

        // Folder를 위한 Writer 객체
        FileWriter fw2 = null;
        BufferedWriter bw2 = null;

        try{
            fw1 = new FileWriter(filename1);
            bw1 = new BufferedWriter(fw1);

            fw2 = new FileWriter(filename2);
            bw2 = new BufferedWriter(fw2);

            for (int i = 0; i < filelists.length; i++) {
                if(filelists[i].isFile()){  // 파일
                    // toString()메소드는 전체 경로(full path)를 보여준다.
                    // getName() 메소드는 파일 이름만 보여준다.
//                    System.out.println("파일 : " + filelists[i].getName());
                    bw1.write(filelists[i].toString());
                    bw1.newLine();
                }
                else{   // 폴더
//                    System.out.println("폴더 : " + filelists[i].toString());
                    bw2.write(filelists[i].toString());
                    bw2.newLine();
                }
            }

            System.out.println("파일 작성 완료");
        }
        catch(IOException e){
            System.out.println("파일 입출력 예외 발생");
            e.printStackTrace();
        }
        finally {
            try {
                if(bw1 != null){bw1.close();}
                if(fw1 != null){fw1.close();}
                if(bw2 != null){bw2.close();}
                if(fw2 != null){fw2.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
