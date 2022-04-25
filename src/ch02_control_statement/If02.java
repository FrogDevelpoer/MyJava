package ch02_control_statement;
/*
    양자택일 if구문
        2가지 경우의 수에서 반드시 1개를 선택하기 위한 구문
    사용형식
        if(condition){
            //condition이 참일 때 수행되는 영역
            }
            else{
            //condition이 거짓일 때 수행되는 영여
 */

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 1개 입력: ");
        int su = scan.nextInt();

        if(su % 2 == 0){
            System.out.println(su + "는(은) 짝수입니다.");
        }
        else{
            System.out.println(su + "는(은) 홀수 입니다");
        }
        scan.close();
    }
}
