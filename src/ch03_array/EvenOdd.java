package ch03_array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []jumsu = new int[5];

        int sum_even = 0, sum_odd = 0;

        for(int i =0; i < jumsu.length; i++){
            System.out.print((i + 1) + "번째 수 입력 : ");
            jumsu[i] = sc.nextInt();
            if(jumsu[i] % 2 == 0){
                sum_even += jumsu[i];
            }
            else{
                sum_odd += jumsu[i];
            }
        }
        System.out.println("짝수의 합: " + sum_even);
        System.out.println("홀수의 합: " + sum_odd);
        sc.close();
    }
}
