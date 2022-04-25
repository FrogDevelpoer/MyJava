package ch05_class;

public class AccountMain01 {
    static String bankName;
    String name;
    int no;
    int balance;

    void Display(){
        System.out.println("철수의 계좌 정보");
        System.out.println("거래처 명 : " + bankName);
        System.out.println("예금주 : " + name);
        System.out.println("계좌 번호 : " + no);
        System.out.println("예치금 : " + balance);

        System.out.println("영희의 계좌 정보");
        System.out.println("거래처 명 : " + bankName);
        System.out.println("예금주 : " + name);
        System.out.println("계좌 번호 : " + no);
        System.out.println("예치금 : " + balance);
    }
}
