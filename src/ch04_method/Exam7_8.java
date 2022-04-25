package ch04_method;

import java.util.Scanner;

public class Exam7_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 하한값 입력: ");
        int lower = sc.nextInt();

        System.out.print("점수 상한값 입력: ");
        int upper = sc.nextInt();

        System.out.print("추출 될 정수 갯수 입력: ");
        int count = sc.nextInt();

        int result = 0;
        for(int i = 0; i < count; i++){
            result = random(lower+0, upper+1);
            String imsi = (i+1) + "번째 수 : %d\n";
            System.out.printf(imsi, result);
        }
        sc.close();
    }
    // a이상 b 미만의 임의의 정수 1개를 반환해주는 메소드
    static int random(int a, int b){
         int result = (int)((b-a) * Math.random() + a);
         return result;
        }
    }

