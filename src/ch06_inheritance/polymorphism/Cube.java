package ch06_inheritance.polymorphism;

public class Cube extends Car{
    private double fuel;

    public Cube(){}

    public Cube(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
    public Cube(String name, int price, double fuel){
        super(name, price);
        this.fuel = fuel;
    }
}
