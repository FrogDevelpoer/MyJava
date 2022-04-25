package ch05_class;
/*
    변수의 종류 : 지역, 인스턴스(멤버), static 변수
    static : 객체의 수에 상관없이 모든 객체가 공유하기 위한 변수
                변수 앞에 static 키워드를 붙이면 된다.
                클래스 변수라고도 불린다.
    지역 변수 : 메소드 내에서 선언된 변수. 메소드에 넘어오는 배개 변수. 반드시 초기화가 되어야 한다.

    final 키워드 : 변수에 final이 붙으면 읽기 전용이 된다.
                    변수에 final이 붙으면 상수가 된다.
 */
public class Saram02 {
    static String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    void Display(){

        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
    }
}
