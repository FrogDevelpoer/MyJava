package ch05_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 soon = new Saram03();
        soon.setName("유관순");

        Saram03 yusin = new Saram03();
        yusin.setName("김유신");
        yusin.setHeight(178.2);
        yusin.setBlood("A");
        yusin.setHobby("축구");
        yusin.setWeight(76);

        System.out.println("이름 : " + yusin.getName());
        System.out.println("키 : " + yusin.getHeight());
        System.out.println("몸무게 : " + yusin.getWeight());
        System.out.println("취미 : " + yusin.getHobby());
        System.out.println("혈액형 : " + yusin.getBlood());
        System.out.println("이름  :" + soon.getName());
    }
}
