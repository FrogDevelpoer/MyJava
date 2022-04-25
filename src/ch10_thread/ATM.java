package ch10_thread;

class Some2{}

public class ATM extends Some2 implements Runnable{
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
        System.out.println("최초 금액 : " + balance + "원");
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                int money = (int)(100 * Math.random() + 50.0);
                if(this.balance >= money && money != 0){
                    withdraw(money);    // 인출하기
                }
                else{
                    Thread th = Thread.currentThread();
                    String name = th.getName();
                    System.out.println("잔액 부족");
                    System.out.println(name + "이(가) " + balance + "원 인출 실패");
                    String imsi = "현재 잔액 : " + balance;
                    imsi += ", 인출 요구액 : " + money;
                    System.out.println(imsi);
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // 임계 영역 : 여러 개의 쓰레드가 동시에 동작할 때 데이터의 무결성 및 신뢰도를 보장 받기 위한 영역
    // 통상적으로 메소드의 형태로 존재한다.
    // 동기화를 하기 위한 키워드 synchronized 사용
    private synchronized void withdraw(int money) {
        this.balance -= money;
        Thread th = Thread.currentThread();
        String name = th.getName();
        System.out.println(name + "이(가) " + money + "원을 인출하여 ");
        System.out.println("통장 잔액이 " + this.balance + "원입니다.");
    }
}
