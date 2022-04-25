package ch02_control_statement;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학점을 입력하세요: ");
        String grade = sc.next();

        switch(grade){
            case "A", "a": case "B", "b":
                System.out.println("참 잘하셨어요.");
                break;
            case "C": case "D":
                System.out.println("좀 더 공부하세요.");
                break;
            case "F":
                System.out.println("재수강 하세요.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
        sc.close();
    }
}
