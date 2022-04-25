package ch07_abstract.cartest;

import java.util.Random;

public class CarMain {
    public static void main(String[] args) {
        Random rand = new Random();

        Car[] mycar = new Car[2];
        mycar[0] = new Tico("티코", 100, "작은 차");
        mycar[1] = new Cube("큐브", 200, 9.5); // 이름, 단가, 연비
        for (int i = 0; i < mycar.length; i++) {
            System.out.println("================================");
            int val = rand.nextInt(20) + 10;
            mycar[i].speedup(val);  // 액셀 밟기
            mycar[i].display();

            mycar[i].speedup(30);
            mycar[i].display();

            val = rand.nextInt(val) + 10;
            mycar[i].speeddown(val);    //브레이크 밟기
            mycar[i].display();

            System.out.println("toString()메소드 오버라이딩");
            System.out.println(mycar[i]);
        }
    }
}
