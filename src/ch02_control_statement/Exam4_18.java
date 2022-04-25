package ch02_control_statement;

import java.util.Scanner;

public class Exam4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i+"의 제곱은"+ (i*i) + "입니다.");
        }
    }
}
