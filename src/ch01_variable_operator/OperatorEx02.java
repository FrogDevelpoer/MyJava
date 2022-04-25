package ch01_variable_operator;

//다음 출력 결과를 예측해 보세요.
public class OperatorEx02 {
    public static void main(String[] args) {
        int n = 10;

        // 단항 연산자에 의한 부호 반전이 되므로 음수 10이 됩니다.
        n = -n ;
        System.out.println("n = " + n);

        n = 100;
        // 출력하기 전에 우선 값이 1 증가 됩니다.
        // 이후 해당 결과를 출력해 줍니다.
        System.out.println("n = " + ++n);
        // 현재 n의 값은 101입니다.

        // 101의 값을 우선 출력된 후, 아래 쪽으로 이동하면서 102의 값으로 변경됩니다.
        System.out.println("n = " + n++);
    }
}