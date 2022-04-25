package ch11_collection;

import java.util.ArrayList;
import java.util.List;

public class MyHaksengList {
    public static void main(String[] args) {
        List<Hakseng> lists = new ArrayList<Hakseng>();

        lists.add(new Hakseng("박영희", 1, 4, 70, 70 ,70));

        Hakseng soo = new Hakseng("김철수", 1, 3, 30, 40 ,50);

        lists.add(soo);

        lists.add(new Hakseng("홍길동", 1, 5, 40, 50 ,60));

        Display(lists);
    }

    private static void Display(List<Hakseng> asdf) {
        System.out.println("항목들 출력하기");
        System.out.println("이름\t\t학년\t반\t국어\t영어\t수학\t총점\t평균");
        for(Hakseng bean : asdf){
            String name = bean.getName();
            int grade = bean.getGrade();
            int ban = bean.getBan();
            int kor = bean.getKor();
            int eng = bean.getEng();
            int math = bean.getMath();
            int total = kor + eng + math;
            double avg = total / 3.0;
            String imsi = name + "\t" + grade + "\t" + ban + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg;
            System.out.println(imsi);
        }
    }
}
