package ch07_abstract.cartest;

public class Tico extends Car{
    private String comment;

    public Tico(){}

    @Override
    public String toString() {
        String imsi= "코멘트 : " + comment;
        return super.toString() + "\n" + imsi;
    }

    public Tico(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;
    }
    @Override
    public void display() {
        String imsi = "%s의 현재속도는 %d입니다.\n";
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
