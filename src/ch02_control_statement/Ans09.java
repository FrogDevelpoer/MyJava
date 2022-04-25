package ch02_control_statement;

import java.util.Scanner;
/*
    서식(format) : 숫자, 문자, 날짜의 포맷을 지정하는 것
    printf 메소드 => 서식을 지정해주는 메소드
    서식 지정자
        %s : 문자열
        %d : 정수형(10진수)
        %f : 실수형(소수점 지정 가능)
        %c : 믄지 1개
    특징: 엔터키 기능이 없어서, '\n' 등의 특수 문자를 사용해야 한다.
 */

public class Ans09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        String name = scan.next();

        System.out.println("나이를 입력하세요 : ");
        int age = scan.nextInt();

        System.out.println("신장을 입력하세요 : ");
        double height = scan.nextDouble();

        System.out.println("성별을 입력하세요(1, 3 중 하나)  : ");
        int _gender = scan.nextInt();
        String gender = _gender == 1 || _gender == 3 ? "남자" : "여자";

        System.out.println("이름: " + name);
        System.out.println("나이 : " + age);
        System.out.println("신장 : " + Math.round(height*10)/10.0);
        System.out.println("성별 : " + gender);

        System.out.println("\nprintf 메소드를 사용한 출력 방식");
        System.out.printf("이름: %s님\n" ,name);
        System.out.printf("나이 :%d세\n ", age);
        System.out.printf("신장 :%fcm\n ", height);
        System.out.printf("성별 :%s\n ", gender);

        System.out.printf("이름: %s님, 나이 :%d세\n" ,name, age);
        scan.close();
    }
}
