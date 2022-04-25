package ch02_control_statement;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("등급을 입력하세요 !");
        String grade = sc.next();

        switch(grade){
            case "A":
                System.out.println("강남 빌딩, 고급 승용차, 노트북 획득!");
                break;
            case "B":
                System.out.println("고급 승용차, 노트북 획득!");
                break;
            case "C":
                System.out.println("노트북 획득!");
                break;
            default:
                System.out.println("다음 기회를 노려보세요!");
        }
        sc.close();
    }
}
