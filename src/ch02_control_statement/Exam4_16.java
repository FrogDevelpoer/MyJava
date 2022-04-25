package ch02_control_statement;

import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개의 별을 보고싶나요?");
        int star = sc.nextInt();

        System.out.println("별 " + star + "개를 출력합니다.");
        for(int i = 1; i <= star; i++){
            System.out.print("*");
            if(i % 5 == 0)
                System.out.println();
        }

        System.out.print("한 줄에 별 몇개를 출력할까요?");
        int line = sc.nextInt();
        for(int i = 1; i <= star; i++){
            System.out.print("*");
            if(i % line == 0)
                System.out.println();
        }
    }
}
