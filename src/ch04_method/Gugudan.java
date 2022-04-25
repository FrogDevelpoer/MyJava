package ch04_method;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 단을 입력하세요.");
        int dan = sc.nextInt();

        gugudan(dan);
    }
    static void gugudan(int dan){
        for (int i = 1; i <= 9 ; i++) {
            String imsi = dan + "*" + i + "=" + dan*i;
            System.out.print(imsi + "  ");
        }
    }
}
