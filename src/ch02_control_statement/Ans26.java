package ch02_control_statement;
/*
    Random클래스
            임의의 데이터를 만들기 위하여 도와 주는 유틸리티 클래스
            정수, 실수, boolean 등에 대하여 임의의 값을 구할 수 있다.
 */

import java.util.Random;
import java.util.Scanner;

public class Ans26 {
    public static void main(String[] args) {
        Random rand = new Random();   //rand 객체는 랜덤수를 뽑아주는 놈.
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            int answer = rand.nextInt(100) + 1;
            System.out.println("정답: " + answer);

            while(true){
                System.out.println("1~100 사이의 정수 입력: ");
                int su = sc.nextInt();

                if(answer > su){
                    System.out.println(su + " 보다 큰 수 입니다.");
                }
                else if(answer < su){
                    System.out.println(su + " 보다 작은 수 입니다.");
                }
                else{
                    System.out.println("정답입니다!");
                    break;
                }
            }
        }
    }
}
