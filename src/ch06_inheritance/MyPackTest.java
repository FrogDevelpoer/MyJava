package ch06_inheritance;


import mypackage.MyPackOne;
import mypackage.MyPackTwo;

import java.util.Scanner;

/*
    패키지 : 유사한 여러 개의 참조 자료형(클래스, 인터페이스, 예외 등등)을 하나의 묶음 형식으로 만들어 놓은 것
    특징 : 패키지 선언은 주석을 제외하고 반드시 첫 줄에 놓아야 한다.
 */
public class MyPackTest {
    public static void main(String[] args) {
        MyPackOne obj1 = new MyPackOne();
        obj1.setData(1234);
        obj1.one();

        MyPackTwo obj2 = new MyPackTwo();
        obj2.two();

        Scanner sc = new Scanner(System.in);
        // java.util.Random.rand = new java.util.Random();
        // 타 패키지 동 클래스의 이름인 경우 구분을 임포트 하지않고 위 같이 직접 코딩하기도 한다.

        // System 클래스 내의 out 객체는 출력 전용 객체이다.
        // out 객체는 개발자가 미리 사용할 수 있도록 만들어 둔 static 객체이다.
        // System 클래스가 import를 하지 않는 이유?
        // import java.lang.* 은 눈에 보이지 않게 자동으로 된다.(암시적 임포트) System 클래스는 lang 안에 속하기 때문에 임포트를 하지 않아도 된다.(String, Math 클래스 포함)
    }
}
