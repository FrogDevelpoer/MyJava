package ch02_control_statement;
import java.util.Scanner;
public class ScanenrExam {
    public static void main(String[] args) {
        //console = 키보드 + 모니터
        //System.in : 키보드
        //System.out : 모니터
        //scan이라는 물건은 키보드에 입력을 받는 장치입니다.
        Scanner scan = new Scanner(System.in);
        System.out.println("이름 입력 : " );
        //next() 메소드가 문자열을 입력 받아주는 역할
        String name = scan.next();
        System.out.println("이름: " + name);

        System.out.println("나이 입력: ");
        int age = scan.nextInt(); //정수를 입력받기 위한 메소드
        System.out.println("나이 : " + age);

        scan.close(); //장치를 닫아줍니다.
    }
}
