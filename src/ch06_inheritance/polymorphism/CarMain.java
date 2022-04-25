package ch06_inheritance.polymorphism;
/*
    일반화(generalization)
        보편적인 변수나 메소드는 슈퍼 클래스에 작성하고, 특화된 변수나 메소드는 서브 클래스에 작성하는 기법
    슈퍼 클래스 : Car(이름, 단가)

    서브 클래스 : Tico(코멘트), Spark(제조 회사), Cube(연비)

    다형성(polymorphism) : 슈퍼 클래스 타입을 사용하여 서브 클래스에 대한 객체를 표현하는 기법법
 */
public class CarMain {
    public static void main(String[] args) {
        Person soo = new Person("김철수");
        Car car = null;

        car = new Tico("티코", 100, "너무 쪼맨행!"); // 승급
        soo.ride(car);
        System.out.println("===================================");

        Person hee = new Person("박영희");
        car = new Spark("스파크", 200, "GM 대우");
        hee.ride(car);
        System.out.println("===================================");

        Person sik = new Person("최민식");
        car = new Cube("큐브", 300, 50);
        sik.ride(car);

        Car[] carlist = new Car[3]; // 배열 정의
        carlist[0] = new Tico("티코2", 400, "앙 단종띠..");
        carlist[1] = new Spark("스파크2", 500, "현대");
        carlist[2] = new Cube("큐브2", 600, 12.5);

        System.out.println("===== 배열 new 연산자 사용하기 =====");
        for (int i = 0; i < carlist.length; i++) {
            soo.ride(carlist[i]);
            System.out.println("********************");
        }
        System.out.println("===== 초기화 기법 사용하기 =====");
        Car[] cararr = {
                new Tico("티코3", 700, "아ㅋㅋ 전기차 사라고 ㅋㅋ"),
                new Spark("스파크3", 800, "기아"),
                new Cube("큐브3", 900, 18.5)
        };
        for (int i = 0; i < cararr.length; i++) {
            hee.ride(cararr[i]);
            System.out.println("********************");
        }
    }
}