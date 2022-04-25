package ch10_thread;

public class TimerRunnable implements Runnable{
    private String name;
    public TimerRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int counter = 0;
        while(true){
            try{
                System.out.println(this.name + " 쓰레드 구동 : " + counter++);
                int wait = 1000;
                Thread.sleep(wait);
            }
            catch(InterruptedException e){
                System.out.println("누군가에 의하여 " + this.name + " 쓰레드 종료");
                e.printStackTrace();
                return; // 예외 발생시 return 구문으로 쓰레드 종료
            }
        }
    }
}
