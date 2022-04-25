package ch01_variable_operator;
/*
    관계연산자 : 두 개의 값을 비교하는 연산자(비교 연산자)
    > >= < <= ==(equal) !=(not equal)
    주의) =(assignment)
    연산의 결과는 boolean(ture/false)타입이 됩니다.
    주로 제어문(if, while, for 등등)에 사용됩니다.

    논리 연산자
         논리곱(&&) and 연산 : 두 개의 진위값이 모두 참일때만 결과가 참이 됩니다.
         논리합(||) or 연산 : 두 개의 진위값이 모두 거짓일때만 결과가 거짓이 됩니다.
         부정(!) not 연산 : 진위의 값을 반대 값으로 바꾸는 동작을의미합니다.
    논리 연산자의 우선 순위
    not(!) > and(&&) > or(||)

 */

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println(3 >= 2);
        System.out.println( !(3 >= 2)); //negative
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 < 2);  //실수형으로 변환 후 선언
        //ture && false => false
        System.out.println((3>2) && (3>4));

        int x = 3, y = 2;
        System.out.println((x != y) || (-1 > 0));

        // 문자는 정수형으로 변환되어 연산
        System.out.println('a' > 'b');


    }
}