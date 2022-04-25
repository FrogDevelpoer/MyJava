package ch02_control_statement;

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇단을 출력할까요?");
        int dan = sc.nextInt();

        int i = 1;
        while(i < 10){
            System.out.println(dan + " * " + i  + " = " + (dan * i));
            i++;
        }
        System.out.println();
    }
}
