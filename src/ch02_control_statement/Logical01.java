package ch02_control_statement;

import java.util.Scanner;

public class Logical01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("월을 입력하세요");
        int month = sc.nextInt();

        if(month >= 3 && month <= 5){
            System.out.println("봄입니다.");
        }
        else if(month >= 5 && month <= 8){
            System.out.println("여름입니다.");
        }
        else if(month >= 9 && month <= 11){
            System.out.println("가을입니다.");
        }
        else{
            System.out.println("겨울입니다.");
        }
        sc.close();
    }
}
