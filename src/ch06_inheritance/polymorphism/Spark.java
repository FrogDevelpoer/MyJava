package ch06_inheritance.polymorphism;

public class Spark extends Car{
    private String maker;

    @Override
    public String toString(){
        String imsi = "제조 회사 : " + maker + "\n";
        return imsi;
    }

    public Spark(){}

    public Spark(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }
    public Spark(String name, int price, String maker){
        super(name, price);
        this.maker = maker;
    }
}
