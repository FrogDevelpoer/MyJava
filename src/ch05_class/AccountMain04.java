package ch05_class;

public class AccountMain04 {
    public static void main(String[] args) {
        Account04 soo = new Account04("김철수", 1234, 1000);
        soo.Display();

        System.out.println();

        Account04 hee = new Account04("박영희", 5678);
        hee.Display();
    }
}
