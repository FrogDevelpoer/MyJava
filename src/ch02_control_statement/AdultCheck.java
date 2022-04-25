package ch02_control_statement;

import java.util.Scanner;

public class AdultCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("1.남자 2.여자");
        int _gender = sc.nextInt();

        String adult;
        if(age >= 19){
            adult = "성인";
        }
        else{
            adult = "미성년자";
        }
        String gender;
        if(_gender == 1){
            gender = "남자";
        }
        else{
            gender = "여자";
        }
        System.out.println(name +"님 "  + age + "세 " + adult + " " + gender);
        sc.close();
    }
}
