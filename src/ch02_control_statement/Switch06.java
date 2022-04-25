package ch02_control_statement;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();

        switch(score / 10){
            case 10: case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
        sc.close();
    }
}
