package ch06_inheritance.polymorphism;

// 슈퍼 클래스에는 보편적인 변수와 메소드를 작성
public class Car {
    private String name;
    private int price;

    public Car(){}

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
