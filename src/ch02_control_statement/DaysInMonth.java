package ch02_control_statement;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days;

        System.out.println("몇월이 보고싶나요?");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println(month+"월은 " +days+"일입니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println(month+"월은 " +days+"일입니다.");
                break;
            case 2:
                days = 28;
                System.out.println(month+"월은 " +days+"일입니다.");
                break;
            default:
                System.out.println("월이 잘못 입력되었습니다.");
        }
    }
}
