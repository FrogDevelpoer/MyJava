package ch10_thread;
/*
    독립 쓰레드
        Main 쓰레드의 종료 여부에 상관 없이 자신의 업무를 계속 진행하는 쓰레드
    종속 쓰레드
        Main 쓰레드 종료 시 같이 종료되는 쓰레드
 */

public class ThreadInterruptMain {
    public static void main(String[] args) {
        System.out.println("main Thread Start");

        TimerRunnable soo = new TimerRunnable("철수");
        Thread mysoo = new Thread(soo); // 승급
        mysoo.start();

        new Thread(new TimerRunnable("영희")).start();

        int killtime = 3000;
        System.out.println((killtime / 1000) + "초 후에 자동 종료됩니다.");
        try {
            Thread.sleep(killtime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mysoo.interrupt();  // 특정 쓰레드 간섭

        System.out.println("main Thread End");
    }
}
