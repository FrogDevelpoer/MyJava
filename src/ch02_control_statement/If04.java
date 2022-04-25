package ch02_control_statement;

import java.util.Scanner;

/*
    다중 택일 if 구문
        3개 이상의 경우의 수에서 하나를 선택하는 구문
    사용 형식
        if(condition){
        }else if(condition2){
        {else if(condition3){
        }...
        }else{
        }
 */
public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요: ");
        int score = sc.nextInt();//점수 입력


        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        sc.close();
    }
}
