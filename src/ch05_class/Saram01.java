package ch05_class;
// 사람 1명에 대한 정보를 저장하기 위한 클래스
// 이 것을 토대로 구체적인 물건을 만들어 내기 위한 탬플릿/설계도
// step01 클래스 정의, 선언
public class Saram01 {
    //멤벼변수 = 인스턴스 변수
    String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    void Display(){ //멤버 메소드
        System.out.println("국적 : " +  nationality);
        System.out.println("이름 : " +  name);
        System.out.println("키 : " +  height);
        System.out.println("몸무게 : " +  weight);
        System.out.println("취미 : " +  hobby);
        System.out.println("혈액형 : " +  blood);
    }
    void Display2(){
        System.out.println("국적 : " +  nationality);
        System.out.println("이름 : " +  name);
        System.out.println("키 : " +  height);
        System.out.println("몸무게 : " +  weight);
        System.out.println("취미 : " +  hobby);
        System.out.println("혈액형 : " +  blood);
    }
}
