package ch05_class;

public class Account04 {
    private String bankName = "국민은행";
    private String name;
    private int accnum;
    private int money;

    public Account04(String name, int accnum, int money){
        this.name = name;
        this.accnum = accnum;
        this.money = money;
    }
    public Account04( String name, int accnum){
        this.name = name;
        this.accnum = accnum;
        this.money = 100;
    }
    public void Display(){
        System.out.println("은행명 : " + bankName);
        System.out.println("이름 : " + name);
        System.out.println("계좌번호  :" + accnum);
        System.out.println("예치금 : " + money +"원");
    }
}
