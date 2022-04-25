package ch04_method;

import java.util.Scanner;

public class MiniCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("\n1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지");
            int choose = sc.nextInt();
            int result = 0;
            if (choose >= 1 && choose <= 5) {
                System.out.print("앞 수 입력: ");
                int num1 = sc.nextInt();

                System.out.print("뒷 수 입력: ");
                int num2 = sc.nextInt();

                switch (choose) {
                    case 1:
                        result = sum(num1, num2);
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        result = sub(num1, num2);
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        result = mul(num1, num2);
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4: case 5:
                        num2 = num2 == 0 ? 1 : num1;
                        if(choose == 4){
                            result = div(num1, num2);
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        }
                        else if(choose == 5){
                            result = mod(num1, num2);
                            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                        }
                        break;
                }
            } else {
                System.out.print("잘못된 값이 입력되어 프로그램을 종료합니다.");
                break;
            }
        }
    }
    static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }
    static int sub(int num1, int num2){
        int result;
        result = num1 - num2;
        return result;
    }
    static int mul(int num1, int num2){
        int result;
        result = num1 * num2;
        return result;
    }
    static int div(int num1, int num2){
        int result;
        result = num1 / num2;
        return result;
    }
    static int mod(int num1, int num2){
        int result;
        result = num1 % num2;
        return result;
    }
}

