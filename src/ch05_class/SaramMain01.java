package ch05_class;

/*
    클래스 : 기존의 자료형들을 몇개 묶어서 새로 만드는 사용자 정의 자료형
    클래스 객체 = new 생성자();
    step02 객체 생성
 */
public class SaramMain01 {
    public static void main(String[] args) {
        Saram01 soo;     //철수 객체
        soo = new Saram01();

        Saram01 hee = new Saram01();
        //dot(.) : 멤버참조 연산자
        //step03 객체의 멤버에 값 설정하기(write)
        soo.nationality = "대한민국";
        soo.name = "김철수";
        soo.height = 185.2;
        soo.weight = 80.0;
        soo.hobby  = "축구";
        soo.blood = "B";
        //step04 객체 정보를 출력하기
        System.out.println("\n김철수의 정보 출력");
        System.out.println("국적 : " + soo.nationality);
        System.out.println("이름 : " + soo.name);
        System.out.println("키 : " + soo.height);
        System.out.println("몸무게 : " + soo.weight);
        System.out.println("혈액형 : " + soo.blood);

        hee.nationality = "대한민국";
        hee.name = "김영희";
        hee.height = 168.0;
        hee.weight = 45.0;
        hee.hobby = "수영";
        hee.blood = "O";

        System.out.println("\n김영희의 정보 출력");
        System.out.println("국적 : " + hee.nationality);
        System.out.println("이름 : " + hee.name);
        System.out.println("키 : " + hee.height);
        System.out.println("몸무게 : " + hee.weight);
        System.out.println("혈액형 : " + hee.blood);

        System.out.println();

        Saram01 yusin = new Saram01();
        Saram01 soon = new Saram01();

        yusin.blood = "O";
        yusin.hobby = "탁구";
        yusin.nationality = "대한민국";
        yusin.weight = 65.2;
        yusin.name = "김유신";
        yusin.height = 175.9;

        yusin.Display();

        System.out.println();

        soon.nationality = "대한민국";
        soon.name = "유관순";
        soon.height = 165.3;
        soon.weight = 54.3;
        soon.hobby = "축구";
        soon.blood = "A";

        soon.Display2();

    }
}
