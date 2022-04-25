package ch01_variable_operator;
/*
    형 변환(casting) : 데이터의 타입을 다른 타입으로 변경하는 것
    암시적 형 변환 : 자바 머신이 알아서 형 변환 하는 것
    명시적 형 번환 : 개발자가 직접 형변환을 코딩하는 것

    아스키 코드 : 문자를 입력하면 10진수 형태의 숫자로 변환해 둔 표
    암기) 0(48), 'A'(65), 'a'(97)
 */
public class Casting {
    public static void main(String[] args) {
        double d = 100; //암시적 형 변환
        System.out.println("d : " + d);

        int i = (int)12.5; //명시적 형 변환
        System.out.println("i: " + i);

        System.out.println(14/5);

        // (double)14/5 -> 14.0/ 5.0 = 2.8
        System.out.println((double)14/5);

        //(double)(14/5) -> (double)(2) = 2.0
        System.out.println((double)(14/5));

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng  + math;
        double avg = (double)total / 3; // 암시적 형 변환(19. / 3 -> 63 -> 63.0)
        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);

        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2; // 암시적 형 변환에 의하여 99 > 97
        System.out.println("bool1: " + bool1);

        int result = ch1 - ch2 + 5; // 99 - 97 + 5
        System.out.println("result :" + result);

        // 조건 연산자를 사용하여 ch3가 대문자인지 소문자인지 판단하는 프로그램을 작성
        // 힌트) 대문자는 'A'보다 크거나 같고, 'Z'보다 작거나 같다.
        char ch3 = 'D';
        char ch4 = 'A';
        char ch5 = 'Z';
        boolean bool = ch3 <= ch5 && ch3 >= ch4;
        System.out.println("ch3은 대문자? :" + bool);

        /*
        바로 위의 코드를 다르게 하면
        char ch3 = 'D';
        String str = ch3 <= 'Z' && ch3 >= 'A';? "대문자 맞음" : "대문자 아님";
        System.out.println("대문자 판단: " + str);
         */

    }
}