package ch09_exception;

import java.util.Scanner;

public class SoshiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] soshi = {"서현", "써니", "수영"};

        System.out.print("멤버 이름 입력 : ");
        String name = sc.next();

        boolean isMember = false;   // true이면 멤버가 맞습니다.

        for (int i = 0; i < soshi.length; i++) {
            if(name.equals(soshi[i])){
                isMember = true;
                break;
            }
        }

        if(isMember == true){
            String imsi = "%s님은 소시 멤버가 맞습니다.\n";
            System.out.printf(imsi, name);
        }
        else{
            String message = name + "님은 소시 멤버가 아닙니다.";
            try {
                throw new GirlException(message);   // 일회용 객체를 생성하여 예외를 발생시킴
            } catch (GirlException err) {
                System.out.println(err.toString()) ;
                System.out.println(err.getMessage()) ;
                err.printStackTrace();
            }
        }
    }
}
