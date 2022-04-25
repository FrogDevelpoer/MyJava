package ch03_array;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = sc.next();

        double total = 0.0;

        int[] jumsu = new int[3];
        for(int i = 0; i < jumsu.length; i++){
            System.out.print((i + 1) + "번째 점수 입력 : ");
            jumsu[i] = sc.nextInt();
            total += jumsu[i];
        }
        double avg = total / jumsu.length;
        System.out.print("학생의 정보");
        String temp = "이름: %s, 총점 : %.2f, 평균 : %.2f";
        System.out.printf(temp, name, total, avg);
        sc.close();
    }
}
