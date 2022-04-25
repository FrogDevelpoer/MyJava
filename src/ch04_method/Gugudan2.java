package ch04_method;

import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 단을 입력하세요:");
        int begin = sc.nextInt();
        System.out.print("끝 단을 입력하세요:");
        int end = sc.nextInt();

        if(begin > end){
            int temp;
            temp = begin;
            begin = end;
            end = temp;
        }
        gugudan(begin, end);
    }
    static void gugudan(int begin, int end){
        for (int i = begin; i <= end ; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
