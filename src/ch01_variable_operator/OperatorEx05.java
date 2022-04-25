package ch01_variable_operator;

//다음 출력 결과를 예측해 보세요.

public class OperatorEx05 {
    public static void main(String[] args) {
        int n = 3;

        // n > 3은 3 > 3이므로 거짓입니다.
        boolean bool1 = n > 3;
        System.out.println("bool1 = " + bool1);

        int n2 = 3;
        n = n2; // 값의 대입
        System.out.println( n == n2 ); // 값이 동일함
        System.out.println( n != n2 );

        //              (3 == 3) && (3 == 3) → true && true → true
        boolean bool2 = (n == 3) && (n2 == 3);
        System.out.println("bool2 = " + bool2);


        // 우선 순위) 산술 > 관계
        //              ( 3 < 0) && (3 + 509 > 200)
        //              ( false) && (512 > 200)
        //              ( false) && (true) → false
        boolean bool3 = ( n < 0 ) && (n2 + 509 > 200);
        System.out.println("boo3 = " + bool3);

        // (n2 + 432 / 2 * 2 != 20) → (3 + 432 != 20) → (435 != 20)  → (true)
        //              (true)    || (true)
        boolean bool4 = ( n > 0 ) || (n2 + 432 / 2 * 2 != 20);
        System.out.println("bool4 = " + bool4);
    }
}