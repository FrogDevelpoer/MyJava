package ch02_control_statement;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문장 혹은 단어를 입력하세요.");
        String hello = sc.next();

        System.out.println("몇번 반복하시겠습니까?");
        int time = sc.nextInt();

        for(int i = 0; i < time; i++){
            System.out.println(hello);
        }
        sc.close();
    }
}
