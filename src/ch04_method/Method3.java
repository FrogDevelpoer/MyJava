package ch04_method;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수를 입력하세요. :");
        int num = sc.nextInt();

        sum(num);    //메소드 호출
        sc.close();
    }
    static void sum(int su){    //void 키워드를 사용한 구문
        int total = 0;
        if(su < 0){
            su = Math.abs(su);
        }
        for (int i = 1; i <= su; i++) {
            total += i;
        }
        System.out.println("총합 : " + total);
    }
}
