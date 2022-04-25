package ch09_exception;

import java.util.Scanner;

public class JumsuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("응시자 입력 : ");
        String name = sc.next();
        System.out.println("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요.");
        int math = sc.nextInt();

        int total = kor + eng + math;

        if(kor <= 40 || eng <= 40 || math <= 40){
            throw new MinJumsuException("과락");
        }
        if(total < 180){
            throw new FailedException("평균 이하 점수");
        }
        double avg = (double)total / 3.0;
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", avg);
        }
        catch (MinJumsuException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("나머지 예외 발생");
        }
        finally {
            sc.close();
        }
    }
}
