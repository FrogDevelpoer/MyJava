package ch06_inheritance.nopolymorphism;

public class Person {
    private String name; // 차주

    private Tico tico = null;
    private Spark spark = null;
    private Cube cube = null;

    public Person(String name) {
        this.name = name;
    }

    public void ride(Tico tico) {
        this.tico = tico;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.tico.getPrice());
        System.out.println("차량 : " + this.tico.getName() + " 시승");
        System.out.println("차량 : " + this.tico.getComment());
    }
    public void ride(Spark spark) {
        this.spark = spark;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.spark.getPrice());
        System.out.println("차량 : " + this.spark.getName() + " 시승");
        System.out.println("제조사 : " + this.spark.getMaker());
    }
    public void ride(Cube cube){
        this.cube = cube;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.cube.getPrice());
        System.out.println("차량 : " + this.cube.getName() + " 시승");
        System.out.println("연비 : " + this.cube.getFuel());
    }
}
