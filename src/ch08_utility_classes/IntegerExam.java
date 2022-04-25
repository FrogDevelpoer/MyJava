package ch08_utility_classes;

import java.util.Scanner;

public class IntegerExam {
    public static void main(String[] args) {
        int i = 10;

        String stri = Integer.toString(i);
        System.out.println(stri);   // 문자열

        String binaryValue = Integer.toBinaryString(i);
        String octalValue = Integer.toOctalString(i);
        String hexaValue = Integer.toHexString(i);

        System.out.println("2진수 : " + binaryValue);
        System.out.println("8진수 : " + octalValue);
        System.out.println("16진수 : " + hexaValue);

        // parsing : 어떤 데이터가 적합한 데이터인지를 검증하는 절차
        // parseInt(문자열, 진법) 메소드 : 데이터를 정수형으로 변환해주는 메소드
        // 진법의 기본 값은 10.
        // parseInt(str, 2) 메소드 : 2진법으로 되어있는 문자열 str을 10진수로 변경.

        String _age = "20";
        int age = Integer.parseInt(_age);
        System.out.println("나이 : " + age);

        int binaryToDecimal = Integer.parseInt(binaryValue, 2);
        int octalToDecimal = Integer.parseInt(octalValue, 8);
        int hexaToDecimal = Integer.parseInt(hexaValue, 16);
        System.out.println("2진수를 10진 정수형으로 변환 : " + binaryToDecimal);
        System.out.println("8진수를 10진 정수형으로 변환 : " + octalToDecimal);
        System.out.println("16진수를 10진 정수형으로 변환 : " + hexaToDecimal);

        System.out.println("부호 메소드");
        System.out.println("Integer.signum(50): " + Integer.signum(50));
        System.out.println("Integer.signum(0): " + Integer.signum(0));
        System.out.println("Integer.signum(-15): " + Integer.signum(-15));

        Scanner sc = new Scanner(System.in);    // 정수 대신 문자열을 입력한 경우 Integer.pasreInt를 사용하여 정수형으로 변경.
        System.out.print("정수 입력 : ");
        String su01 = sc.next();    // 입력 받는 숫자들은 사실 문자열. 1234 입력
        int su02 = Integer.parseInt(su01) + 300;    // 정수형으로 파싱되고, +300 연산 이루어짐
        System.out.println("300 더한 값 : " + su02);   // 숫자 su02가 문자열로 형변환.

        // 거의 모든 wrapper 클래스에는 valueOf()라는 메소드가 있음.
        // 이 메소드는 데이터를 해당 클래스 타입으로 변경해주는 메소드.
        // Integer.valueOf("1234")는 문자열 "1234"를 Integer 1234로 변경해줌.
        int su03 = Integer.valueOf(su01) - 100;
        System.out.println("100을 뺀 값 : " + su03);

        su02 = 20;
        su03 = 30;
        System.out.println("큰 수 : " + Integer.max(su02, su03));
        System.out.println("작은 수 : " + Integer.min(su02, su03));
        System.out.println("합계 : " + Integer.sum(su02, su03));
    }
}
