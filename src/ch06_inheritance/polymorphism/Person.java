package ch06_inheritance.polymorphism;

public class Person {
    private String name;
    private Car car;  // 일반적인 차 (Car) 라는 객체

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void ride(Car car) {
        this.car = car;

//        System.out.println("슈퍼에 선언된 변수는 강등하지 않아도 출력이 가능하다.");
        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.car.getPrice());
        System.out.println("차량 : " + this.car.getName() + " 시승");
        if(car instanceof Tico){
            Tico mytico = (Tico)car; // 강등
            System.out.println("코멘트 : " + mytico.getComment());
        }
        if(car instanceof Spark){
            Spark heeSpark = (Spark)car;
            System.out.println("제조 회사 : " + heeSpark.getMaker());
        }
        if(car instanceof Cube){
            Cube sikcar = (Cube)car;
            System.out.println("연비 : " + sikcar.getFuel());
        }

    }
}
