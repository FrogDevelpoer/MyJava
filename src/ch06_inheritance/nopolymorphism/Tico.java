package ch06_inheritance.nopolymorphism;

public class Tico {
    private String name; //이름
    private int price; //가격
    private String comment; //코멘트

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }

    public Tico(String name, int price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;

    }
}
