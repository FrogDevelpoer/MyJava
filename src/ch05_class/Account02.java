package ch05_class;

public class Account02 {
    static String bankName;
    String name;
    int no;
    int balance;

    void Display(){
        System.out.println("거래 은행 : " + bankName);
        System.out.println("예금주 : " + name);
        System.out.println("계좌번호 : " + no);
        System.out.println("예치금 : " + balance);
        System.out.println();
    }
}
