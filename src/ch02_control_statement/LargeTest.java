package ch02_control_statement;

import java.util.Scanner;

public class LargeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 수를 입력하세요. :  ");
        int su1 = scan.nextInt();
        System.out.println("두번째 수를 입력하세요. :  ");
        int su2 = scan.nextInt();

        if(su1 > su2){
            System.out.println("첫번째 수가 더 큽니다.");
        }
        else{
            System.out.println("두번째 수가 더 큽니다.");
        }
        scan.close();
    }
}
