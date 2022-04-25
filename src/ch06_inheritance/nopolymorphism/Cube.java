package ch06_inheritance.nopolymorphism;

public class Cube {
    private String name;
    private int price;
    private double fuel; //연비

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getFuel() {
        return fuel;
    }

    public Cube(String name, int price, double fuel) {
        this.name = name;
        this.price = price;
        this.fuel = fuel;
    }
}
