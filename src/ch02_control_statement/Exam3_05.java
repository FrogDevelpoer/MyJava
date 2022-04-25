package ch02_control_statement;

import java.util.Scanner;

public class Exam3_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int num  = sc.nextInt();

        if(num % 5 == 0 && num > 0){
            System.out.println("이 값은 5로 나누어집니다.");
        }
        else if(num % 5 != 0 && num > 0){
            System.out.println("이 값은 5로 나누어지지 않습니다.");
        }
        else{
            System.out.println("양의 정수가 아닌 값을 입력했습니다.");
        }
        sc.close();
    }
}
