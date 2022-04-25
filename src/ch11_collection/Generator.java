package ch11_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator extends Thread{
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    @Override
    public void run() {
        System.out.println("데이터를 생성하고 있습니다.");
        for (int i = 0; i < 100; i++) {
            int key = new Random().nextInt(10) + 1;
            if(map.containsKey(key) == true){
                int newvalue = map.get(key) + 1;
                map.put(key, newvalue);
            }
            else{
                map.put(key, 1);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        PrintResult();
    }

    private void PrintResult() {
        System.out.println("결과 출력");
        for(int i = 1; i<= 10; i++){
            int value = map.get(i);
            System.out.println(i + "\t" + value);
        }
        System.out.println("결과다 그지깽깽아 ㅋ");
    }
}
