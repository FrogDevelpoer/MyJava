package ch02_control_statement;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 1개를 입력: ");
        int su = scan.nextInt();
        if (su % 3 == 0) {
            System.out.println(su * su);
        } else {
            System.out.println(su + 5);
        }
        scan.close();
    }
}
