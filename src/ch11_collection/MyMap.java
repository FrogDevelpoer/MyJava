package ch11_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("KT", 1);
        map.put("두산", 2);
        map.put("삼성", 3);
        map.put("LG", 4);

        int pos = 5;
        String fineteam = "NC";
        boolean bool = map.containsKey(fineteam);  // 값 중 5가 들어있는지 확인
        System.out.println(fineteam + "팀이 있나요? " + bool);

        bool = map.containsValue(pos);  // 값 중 5가 들어있는지 확인
        System.out.println(pos + "가 있나요? " + bool);

        // "NC"팀이 존재하지 않으면 ,순위를 7값으로 추가
        if(!map.containsKey(fineteam)){ // 이건 내가 한 방법
            map.put(fineteam, 7);
        }
        // if(map.containsKey(fineteam) == false){
        //            map.put(fineteam, 7);
        //        } 이건 선생님이 하신 방법


        // 이미 추가된 "삼성"을 8위로 변경.
        map.put("삼성", 8);   // 기존의 값을 Overwrite. 기존의 숫자 3은 덮어쓰기가 됨.

        Integer rank = map.get("LG");
        System.out.println("LG 순위 : " + rank);

        rank = map.get("넥센");
        System.out.println("넥센 순위 : " + rank);

        Set<String> keylist = map.keySet();
        for(String key: keylist){
            Integer value = map.get(key);
            String imsi = "키 : %s, 값 : %d\n";
            System.out.printf(imsi, key, value);
        }
        // 두산과 KT의 순위를 +1
        // 1. keySet() 메소드를 이용하여 Set 객체 구현
        // 2. 확장 for 구문을 이용하여 반복하면서 '두산' 또는 'KT'일때 순위를 읽어와서 +1 연산 (get()메소드)
        // 다시 값 설정(put()메소드)
        for(String key : keylist){
            if(key.equalsIgnoreCase("두산") || key.equalsIgnoreCase("KT")){
                Integer value = map.get(key); // 현재 순위
                int newValue = value + 1; // 새로운 순위
                map.put(key, newValue); // 새로운 순위를 이용하여 기존 값을 덮어쓰기
            }
        }
        System.out.println("순위 변경된 이후 출력하기");
        for(String key: keylist){
            Integer value = map.get(key);
            String imsi = "키 : %s, 값 : %d\n";
            System.out.printf(imsi, key, value);
        }

        map.clear();
        if(map.isEmpty() == true){
            System.out.println("맵이 비어 있습니다.");
        }
        else{
            System.out.println("맵 요소가 들어 있습니다.");
        }

        System.out.println("요소 크기  : " + map.size());
    }
}
