package ch01_variable_operator;

//다음 프로그램의 실행 결과를 예측하시오.
//힌트 : 프로그램은 왼쪽 --> 오른쪽, 상단 --> 하단으로 수행된다.
//*와 /가 +와 -보다 우선적으로 수행된다.

public class OperatorEx01 {
    public static void main(String[] args) {
        boolean bool = true;
        bool = !bool;

        // 이전 bool의 값은 반전시키므로 false가 됩니다.
        System.out.println("bool = " + bool );

        // 좌측에서 우측으로 실행이 되므로 문자열 "88"이 출력됩니다.
        // ["" + 8 + 8] → ["8" + 8] → ["88"]
        System.out.println("" + 8 + 8);

        // '8 + 8'을 숫자로 인식하여 16을 만든 다음 문자열로 변형됩니다.
        // [8 + 8 + ""] → [16 + ""] → ["16"]
        System.out.println(8 + 8 + "");

        // 직관적인 코드가 되도록 ()를 사용하라
        // 소괄호가 먼저 연산이 되어 64가 된 다음에 문자열로 변형됩니다.
        // ["" + (8 * 8)] → ["" + (64)] → ["64"]
        System.out.println( "" + (8 * 8));	//??

        // 소괄호가 먼저 실행되므로 문자열 8이 되고, 앞의 수 8과 합쳐져서 문자열 "88"이 됩니다.
        // [8 + (8 + "")] → [8 + "8"] → ["88"]
        System.out.println(8 + (8 + ""));
    }
}