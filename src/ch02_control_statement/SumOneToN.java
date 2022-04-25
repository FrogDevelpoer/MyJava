package ch02_control_statement;

import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0;

        System.out.print("마지막 수를 입력하세요.");
        int last = sc.nextInt();

        for(int i = 1; i <= last; i++){
            sum += i;
        }
        System.out.println("1부터" + last + "까지의 합 :" + sum);
    }
}
