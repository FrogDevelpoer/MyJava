package jongukprac;

import java.util.Random;
import java.util.Scanner;

public class Ans26 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            int answer = rand.nextInt(100) + 1;

            while(true){
                System.out.println("1~100 사이의 정수 입력: ");
                int su = sc.nextInt();

                if(answer > su){
                    System.out.println(su + "보다 큰 수 입니다.");
                }
                else if(answer < su){
                    System.out.println(su + "보다 작은 수 입니다.");
                }
                else{
                    System.out.println("정답입니다!");
                    System.out.println("정답 : " + answer);
                    break;
                }
            }
        }
    }
}
