package ch11_collection;

public class Saram {
    private String name; // 이름
    private double height; // 키
    private double weight; // 몸무게
    private String hobby; // 취미
    private String blood; // 혈액형


    public Saram(Object obj) {
    }

    @Override
    public String toString() {
        return "Saram{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hobby='" + hobby + '\'' +
                ", blood='" + blood + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
