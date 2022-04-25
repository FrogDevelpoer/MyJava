package ch01_variable_operator;

// 다음 출력 결과를 예측해 보세요.
public class OperatorEx03 {
    public static void main(String[] args) {
        int n1 = 10;
        double s2 = 3.14 ;

        // 명시적 형변환에 의하여 (int)3.14은 정수 3이 됩니다.
        // 10/(int)3.14 → 10/3 → 3이 됩니다.
        System.out.println(n1/(int)s2);

        // (double)10/3.14 → 10.0/3.14 → 3.184713375이 됩니다.
        System.out.println((double)n1/s2);

        // 10을 4로 나뉘면 몫이 2이고, 나머지가 2입니다.
        // (10 % 4)는 나머지를 출력해 줍니다.
        System.out.println(10 % 4);
    }
}