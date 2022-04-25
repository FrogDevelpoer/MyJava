package ch09_exception;

import java.util.Scanner;

public class MyException02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("첫번째 정수 입력 : ");
            int x = Integer.parseInt(sc.next());

            System.out.println("두번째 정수 입력 : ");
            int y = Integer.parseInt(sc.next());

            System.out.println("결과 :" + x / y);
        }
        catch(NumberFormatException e){
            System.out.println("숫자만 입력하라고 ㅋㅋ");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나누려고 하다니 어리석다.");
        }
        catch (Exception ex){
            System.out.println("나머지 예외임");
        }
        finally {
            System.out.println("오느른 여기까쥐~");
            sc.close();
        }
    }
}
