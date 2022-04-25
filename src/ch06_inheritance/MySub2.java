package ch06_inheritance;

// 서브클래스 extends 슈퍼클래스
public class MySub2 extends MySuper2{
    public MySub2() {
        // 눈에 보이지 않지만 super()라는 코드가 숨어있다.
        super(); // 명시적으로 작성하면 암시적인게 사라짐.
        System.out.println("B");
    }
    public MySub2(String name){
//        super.name = name;
//        super.setName(name);
        super(name);
        System.out.println("C");
    }
}
