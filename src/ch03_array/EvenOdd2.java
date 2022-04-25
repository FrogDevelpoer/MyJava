package ch03_array;

import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        int[] jumsu = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jumsu.length; i++) {
            System.out.print((i + 1) + "번째 수 입력:" );
            jumsu[i] = sc.nextInt();

            if(jumsu[i] % 2 == 0){
                even += jumsu[i];
            }
            else{
                odd += jumsu[i];
            }
        }
        System.out.println("홀수의 합 : " + odd);
        System.out.println("작수의 합 : " + even);
    }
}
