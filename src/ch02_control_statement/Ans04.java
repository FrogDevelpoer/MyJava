package ch02_control_statement;
import java.util.Scanner;

public class Ans04 {
    public static void main(String[] args) {
        int result = 0;
        double avg = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("수험자의 이름입력: ");
        String name = scan.next();

        System.out.println("국어 점수를 입력하세요.");
        int kor = scan.nextInt();
        System.out.println("영어 점수를 입력하세요.");
        int eng = scan.nextInt();
        System.out.println("수학 점수를 입력하세요.");
        int math = scan.nextInt();

        result = kor + eng + math;
        avg = result / 3.0;

        System.out.println("수험자: "+  name);
        System.out.println("국어 : "+  kor);
        System.out.println("영어 : "+  eng);
        System.out.println("수학: "+  math);
        System.out.println("총 점수는: " + result);
        System.out.println("평균 점수: " + Math.round(avg*1000)/1000.0);

        scan.close();


    }
}
