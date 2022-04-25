package ch05_class;

public class SaramMain02 {
    public static void main(String[] args) {

        // 변수 nationality는 static 변수이므로 클래스 이름으로 접근이 가능.
        // 따라서, static 변수를다른 용어로 클래스 변수라고 한다.
        // 공유가 가능하므로 누구든지 수정이 가능하다.
        System.out.println("국적 : " + Saram02.nationality);

        Saram02 yusin = new Saram02();

        // static 변수는 객체 이름인  yusin을 사용하여 변경이 가능하다.
        yusin.nationality = "대한민국";
        yusin.name = "김유신";
        yusin.height = 175.3;
        yusin.weight = 75.2;
        yusin.hobby = "당구";
        yusin.blood = "AB";
        yusin.Display();

        System.out.println();

        Saram02 soon = new Saram02();
        //김유신이 변경한 내용을 유관순이 확인하고 있다.
        System.out.print("국적 : " + soon.nationality);
        soon.name = "유관순";
        soon.height = 160.3;
        soon.weight = 45.2;
        soon.hobby = "음악감상";
        soon.blood = "O";
        soon.Display();
    }
}
