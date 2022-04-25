package ch04_method;

import java.util.Scanner;

public class RecursiveCall01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 수 입력: ");
        int su = sc.nextInt();

        int result = Factorial(su);
        System.out.println(su + "!= " + result);

        for (int i = 1; i <= 10 ; i++) {
            result = Factorial(i);
            System.out.println(i + "! =" + result);
        }
        System.out.println("정수 1개 입력: ");
        int num = sc.nextInt();
        result = sum(num);
        String imsi = "1부터 " + num + "까지의 총합 : " + result;
        System.out.println(imsi);
    }
    static int Factorial(int su){
        if(su == 1){
            return 1;
        }
        return su * Factorial(--su);
    }
    static int sum(int num){
        if(num == 1) {
            return 1;
        }
        return num + sum(--num);
    }
}
