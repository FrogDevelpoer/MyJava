package ch02_control_statement;

import java.util.Scanner;

public class WhileQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 수를 입력하세요");
        int num2 = sc.nextInt();

        int sum = 0;
        int i = num1;
        while(i < num2){
            if(i % 3 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
