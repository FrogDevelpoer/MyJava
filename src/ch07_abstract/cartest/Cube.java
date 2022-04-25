package ch07_abstract.cartest;

public class Cube extends Car{
    private double fuel;

    public Cube(String name, int price, double fuel) {
        super(name, price);
        this.fuel = fuel;
    }
    public Cube(){}

    @Override
    public String toString() {
        String imsi = "연비 : " + fuel;
        return super.toString() + "\n" + imsi;
    }

    @Override
    public void display() {
        String imsi = "%s의 현재 속도는 %d입니다.\n";
        System.out.printf(imsi, super.getName(), super.getSpeed());
    }

    @Override
    public void speedup(int su) {
        super.setSpeed(+su);
    }

    @Override
    public void speeddown(int su) {
        super.setSpeed(-su);
    }
}

