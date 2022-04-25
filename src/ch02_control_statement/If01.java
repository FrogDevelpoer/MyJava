package ch02_control_statement;
/*
    제어문(control statement) : 프로그램의 순서를 제어 또는 분기하거나, 문장들의 반복 수행을 하기 위한 구문
    조건문(선택문)
        프로그램의 흐름을 조정/실행 순서를 변경
        if, switch ... case

    반복문
        특정한 구문을 반복적으로 실행하는 구문
        for, while, do...while
    보조 제어문
        제어문에 대한 보조 역할
        continue, break
 */
/*
    변수 x가 짝수 인가요 => x % 2 == 0
    변수 x가 3의 배수 인가요? => x % 3 == 0
    변수 x는 y의 약수 인가요?  => y % x == 0
    변수 x가 3의 배수이거나 5의 배수 인가요? ==> x % 3 == 0 || y % 5 == 0
    변수 ch1은 소문자가 맞습니까?  ==>  ch1 >= 'a' && ch1 <= 'z'
 */

import java.util.Scanner;

/*
    단순 if구문 : 특정 조건에만 맞는 경우에만 해당 내용을 수행해주는 구문
    사용 형식 : if(condition){
                  // todolist..
               }
               condition(조건식)이 참일 경우에만 body 안쪽의 내용이 실행됩니다.
               body는 {와 }로 둘러 싸인 영역을 의미합니다.
 */
public class If01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 1개 입력: ");
        int su = scan.nextInt();

        if (su % 2 == 0) {
            System.out.println(su + "은(는) 짝수입니다.");
        }
        else{
            System.out.println(su + "은(는) 홀수입니다");
        }
        scan.close();
    }
}
