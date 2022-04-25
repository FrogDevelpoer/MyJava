package ch02_control_statement;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주사위를 굴려주세요!");
        int num = sc.nextInt();

        switch(num){
            case 1: case 3: case 5:
                System.out.println("홀수");
                break;
            case 2: case 4: case 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("error");
                break;
        }
        sc.close();
    }
}
