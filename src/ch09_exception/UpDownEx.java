package ch09_exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class UpDownEx {
    public static void main(String[] args) {
        Random rand = new Random();

        int answer = rand.nextInt(100) + 1;
        System.out.println("컴퓨터가 기억한 숫자 : " + answer);

        Scanner sc = null;
        sc = new Scanner(System.in);
        int cnt = 0;

        while(true) {
            System.out.print("1부터 100사이의 정수 입력 : ");
            try {
                int x = Integer.parseInt(sc.next());
                cnt++;
                if(answer > x){
                    System.out.println("더 큰 수를 입력하세요.");
                }
                else if(answer < x){
                    System.out.println("더 작은 수를 입력하세요.");
                }
                else{
                    System.out.println("정답!");
                    System.out.println("시도한 횟수는 " + cnt + "번 입니다.");
                    break;
                }
            } catch (InputMismatchException err) {
                System.out.println("유효하지 않은 값입니다. 정수를 입력하세요.");
            } catch (Exception err) {
                System.out.println("기타 예외 발생");
            } finally {

            }
        }
        sc.close();
    }
}
