package ch04_method;

import java.util.Scanner;

public class StarPrint {
    static void showStar(int star){
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 별 갯수 입력: ");
        int star = sc.nextInt();

        // 입력된 정수가 0이라면 5개, 음수가 입력되면 양수로 바꾸어 출력
        if(star < 0){
            showStar(Math.abs(star));
        }
        else if(star == 0){
            showStar(5);
        }
        else{
            showStar(star);
        }
    }
}
