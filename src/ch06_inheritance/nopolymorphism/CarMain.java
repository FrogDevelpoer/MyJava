package ch06_inheritance.nopolymorphism;

public class CarMain {
    public static void main(String[] args) {
        Person soo = new Person("김철수");
        Tico tico = new Tico("티코", 100, "너무 쪼맨해요~!");

        soo.ride(tico);
        System.out.println("====================");

        Person hee = new Person("박영희");
        Spark spark = new Spark("스파크", 200, "GM 대우");
        hee.ride(spark);
        System.out.println("====================");

        Person uk = new Person("고종욱");
        Cube cube = new Cube("큐브", 300, 50);
        uk.ride(cube);
    }
}
