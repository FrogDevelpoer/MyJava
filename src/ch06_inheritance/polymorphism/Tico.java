package ch06_inheritance.polymorphism;

// 서브 클래스에는 이 클래스에 특화된 변수와 메소드를 작성.
public class Tico extends Car{
    private String comment;

    public Tico() {
    }

    public String getComment() {
        return comment;
    }

    public Tico(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;

    }
}
