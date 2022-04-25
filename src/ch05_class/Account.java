package ch05_class;

public class Account {
    public static void main(String[] args) {
        AccountMain01 soo = new AccountMain01();
        AccountMain01 hee = new AccountMain01();
        soo.bankName = "국민 은행";
        soo.name = "김철수";
        soo.no = 1234;
        soo.balance = 1000;

        soo.Display();

        System.out.println();

//        System.out.println(soo.bankName);
        hee.name = "박영희";
        hee.no = 5678;
        hee.balance = 1000;

        hee.Display();
    }
}
