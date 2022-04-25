package ch10_thread;

public class ThreadMain {
    public static void main(String[] args) {
        Thread myth = Thread.currentThread();   // 현재 구동중인 쓰레드 찾기
        long id = myth.getId();
        System.out.println("쓰레드 id : " + id);

        String name = myth.getName();
        System.out.println("쓰레드 이름 : " + name);

        int priority = myth.getPriority();
        System.out.println("쓰레드 우선 순위 값 : " + priority);

        Thread.State state = myth.getState();
        System.out.println("쓰레드 상태 : " + state);

        System.out.println("잠온다");  // 아래 구문은 3초 뒤 출력
        int wait = 3000;
        System.out.println(wait/1000 + "초 뒤 잠이와 출력.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("잠이와");
    }
}
