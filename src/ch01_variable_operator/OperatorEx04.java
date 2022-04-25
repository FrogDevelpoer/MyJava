package ch01_variable_operator;

// 다음 출력 결과를 예측해 보세요.

public class OperatorEx04 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 10, n3, n4, val = 10;

        // n1이 +1 되어 11이 됩니다.
        // n3도 11의 값을 가집니다.
        n3 = ++n1;
        // n1=11, n3=11

        // n4는 n2의 값, 즉 10을 가집니다.
        // 이후 n2는 +1 되어 11이 됩니다.
        n4 = n2++;
        // n2=11, n4=10

        System.out.println(n1 + ", " + n2);
        System.out.println(n3 + ", " + n4);

        // 좌측에서 우측으로 진행해 나가되, 증감 연산자에 의하여 값이 변경이 됩니다.
        //                  10  +  11   +  11 + 11    + 12  + 12    + 10  = 77
        System.out.println( val + ++val + val + val++ + val + val-- + --val );

        System.out.println("val = " + val);
    }
}