package ch06_inheritance;
/*
    상속 관계에서 생성자의 호출 순서는 슈퍼클래스가 먼저 동작.
    이유 : 상속관계의 생성자에는 암시적으로 super()라는 코드가 숨어있다.

    Super키워드
        서브 클래스에서 슈퍼 클래스를 지칭하는 용어
        super(매개변수)는 super의 생성자 호출
        super.변수 는 해당 변수를 참조
        super.메소드() 는 해당 메소드를 호출
 */
public class InheTest2 {
    public static void main(String[] args) {
        MySub2 sub = new MySub2();
    }
}
