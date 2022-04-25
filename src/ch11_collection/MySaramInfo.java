package ch11_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySaramInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원 수를 입력하세요 : ");
        int entry = sc.nextInt();

        List<Saram> lists = new ArrayList<Saram>();

        for(int i = 0; i < entry; i++){
            Saram bean = new Saram(lists);
            System.out.println((i + 1) + "번째 인원입니다.");

            System.out.print("이름 : ");
            String name = sc.next();
            bean.setName(name);

            System.out.print("키 : ");
            double height = sc.nextDouble();
            bean.setHeight(height);

            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            bean.setWeight(weight);

            System.out.print("취미 : ");
            String hobby = sc.next();
            bean.setHobby(hobby);

            System.out.print("혈액형 : ");
            String blood = sc.next();
            bean.setBlood(blood);

            lists.add(bean);
        }
        SaramDao dao = new SaramDao();
        dao.ShowData(lists);

    }
}
