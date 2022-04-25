package ch06_inheritance;

public class InheTest {
    public static void main(String[] args) {
        Mysub sub = new Mysub();

        sub.y = 300;   // 객체 자신이 가지고 있는 변수이므로 접근 가능
        System.out.println("sub.y : " + sub.y);

        //상속을 받고 있고, 접근 지정자가 private가 아니므로 접근이 가능하다.
        sub.x = 700;
        System.out.println("sub x : " + sub.x);

        // private 변수는 상속을 할 수 없다.
        // System.out.println("sub hello : " + sub.hello);

        // 공개(public) 메소드를 사용하여 private 변수에 접근하는 예시
        String name = "뿅뺭";
        sub.sayHello(name);
    }
}
