package ch04_method;

import java.util.Scanner;

public class Method05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력:");
        String name = sc.next();

        System.out.println("나이 입력: ");
        int age = sc.nextInt();
        namePrint(name, age);
    }
    static void namePrint(String name, int age){
        String imsi = name + "의 나이는 " + age + "세 입니다.";
        System.out.println(imsi);
        if(age < 19){
            System.out.println("미성년자 입니다.");
        }
        else{
            System.out.println("성인 입니다");
        }
    }
}
