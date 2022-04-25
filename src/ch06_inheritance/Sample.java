package ch06_inheritance;
/*
    Sample 클래스는 암시적으로 Object클래스를 상속 받고 있다.
    오버라이딩(overriding)
        슈퍼 클래스의 메소드를 서브 클래스가  다시 정의하는 것(재정의)
    메소드 은닉화 현상
        오버라이딩시 본의 아니게 super()의 메소드를 호출하지 못하는 현상
    오버라이딩은 슈퍼의 메소드 정책과 다르게 구현하고자 할때 사용한다.
 */
public class Sample {
    public String toString(){
        return super.toString() + "\n나는 오버라이딩 결과 ㅎ";
    }
}
