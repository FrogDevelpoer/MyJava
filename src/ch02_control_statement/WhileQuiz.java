package ch02_control_statement;

import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {
        // 작은 수 이상, 큰 수 이하 내의 모든 정수의 합을 구한다.
        // 단, 3의 배수는 제외한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("최소의 수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println("최대의 수를 입력하세요 : ");
        int num2 = sc.nextInt();

        int sum = 0;
        for(int i = num1; i <= num2; i++){
            if(i % 3 != 0)
                sum += i;
        }
        System.out.println("합계: " + sum);
    }
}
