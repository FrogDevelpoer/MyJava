package ch05_class;

public class AccountMain02 {
    public static void main(String[] args) {
        Account02 soo = new Account02();
        Account02 hee = new Account02();
        soo.bankName = "국민 은행";
        soo.name = "김철수";
        soo.no = 1234;
        soo.balance = 1000;

        soo.Display();

        System.out.println();

        hee.name = "박영희";
        hee.no = 5678;
        hee.balance = 1000;

        hee.Display();
    }
}
