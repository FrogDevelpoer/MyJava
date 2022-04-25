package ch06_inheritance;

public class Book {
    private String name; // 이름
    private double price; // 단가
    private String education; // 교육 기관

    @Override // 아래 메소드는 오버라이딩
    public String toString() {
        String imsi = "";
        imsi += "책이름 : " + name;
        imsi += ", 단가 : " + price;
        imsi += ", 교육 기관 : " + education;
        return imsi;
    }

    public Book(String name, double price, String education) {
        this.name = name;
        this.price = price;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getEducation() {
        return education;
    }
}
