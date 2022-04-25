package schedule;

import java.io.IOException;

public class ScheduleTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");
        System.out.println("A : 상담원 직접 할당");

        int ch = System.in.read();
        Schedule schedule = null;

        if(ch == 'R' || ch == 'r'){
            schedule = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l'){
            schedule = new LeastJob();
        }
        else if(ch == 'P' || ch == 'p'){
            schedule = new PriorityAllocation();
        }
        else if(ch == 'A' || ch == 'a'){
            schedule = new AgentGetCall();
        }
        else{
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }
        schedule.getNextCall();
        schedule.sendCallToAgent();
    }
}
