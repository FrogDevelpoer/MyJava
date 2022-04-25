package ch05_class;

public class AccountMain03 {
    public static void main(String[] args) {
        Account03 soo = new Account03();
        soo.setName("김철수");
        soo.setNo(1234);
        soo.setBalance(1000);

        System.out.println("김철수의 정보");
        System.out.println("은행 명: " + Account03.bankName);
        System.out.println("이름 : " + soo.getName());
        System.out.println("계좌 번호 : " + soo.getNo());
        System.out.println("예치금 : " + soo.getBalance());

        System.out.println();

        Account03 hee = new Account03();
        hee.setName("박영희");
        hee.setNo(5678);
        hee.setBalance(10000);

        System.out.println("박영희의 정보");
        System.out.println("은행 명: " + Account03.bankName);
        System.out.println("이름 : " + hee.getName());
        System.out.println("계좌 번호 : " + hee.getNo());
        System.out.println("예치금 : " + hee.getBalance());
    }
}