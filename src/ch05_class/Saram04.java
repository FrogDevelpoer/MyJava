package ch05_class;

import java.util.Scanner;

// 클래스 = 변수 + 메소드 + 생성자
public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;
    Scanner sc = null;

    public Saram04(){
        System.out.println("난 매개변수 없는 생성자야");
        this.name = "김철수"; //인스턴스 변수 초기화
        this.sc = new Scanner(System.in); // 스캐너 객체 초기화

    }
    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }
    public Saram04(String name, double height, double weight, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "당구";
        this.blood = blood;
    }

    public void Display(){
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
    }
}
