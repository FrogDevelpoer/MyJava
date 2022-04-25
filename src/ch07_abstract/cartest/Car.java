package ch07_abstract.cartest;

public abstract class Car implements Speed, Display{
    private String name; // 이름
    private int price;  // 단가

    @Override
    public String toString() {
        String imsi = "이름 : " + this.name + "\n";
        imsi += "단가 : " + this.price + "원";
        return imsi;
    }

    public String getName() {
        return name;
    }

    public Car(){}

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // 모든 차에는 속도 개념이 있으므로 super에서 작성
    private int speed;  // 차량 현재 속도

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed += speed;    // 속도는 누적되어야 하므로 += 연산자 사용
    }
}
