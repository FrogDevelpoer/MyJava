package jongukprac;

import java.util.Scanner;

public class Ans24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 크기 입력: ");

        int size = sc.nextInt();
        double total = 0.0, avg = 0.0;

        double[] score = new double[size];

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + "번째 요소 값 입력: ");
            score[i] = sc.nextDouble();
            System.out.println("score[" + i + "] = " + score[i]);
            total += score[i];
            avg = total / size;
        }
        System.out.printf("총합 : %.2f", total);
        System.out.println();
        System.out.printf("평균 : %.2f", avg);
    }
}
