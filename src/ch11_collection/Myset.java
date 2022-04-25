package ch11_collection;

import java.util.HashSet;
import java.util.Set;

public class Myset {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();
        set.add("잠온다"); // 승급(String --> Object)
        set.add("123");   // 승급(int --> Integer --> Object)
        set.add("false");
        set.add("배고파");

        set.clear();    // 요소 목록 비우기

        set.add("배고파");     // 요소 목록 비우고 다시 추가
        set.add("잠이와");
        set.add("자고싶어");
        set.add("덮밥먹어야징");
        System.out.println("잘거야 존재 여부 : " + set.contains("잘거야"));
        System.out.println("배고파 존재 여부 : " + set.contains("배고파"));

        if(!set.contains("잘거야")){   // "잘거야"가 없으면 추가하기
            set.add("잘거야");
        }
        set.remove("잠이와");

        System.out.println("확장 for를 이용하여 출력하기");
        for (Object item : set) {
            System.out.println(item);
        }

        Object[] arr = set.toArray();
        System.out.println("확장 for를 이용한 배열 출력");
        for (Object item : arr) {
            System.out.println(item);
        }

        // 집합 a와 b에 정수형 데이터만 넣고자 하는 경우
        Set<Integer> setA = new HashSet<Integer>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
//        setA.add("aaa");  // Integer 선언하여 문자열은 입력되지 않도록 함

        Set<Integer> setB = new HashSet<Integer>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        Set<Integer> union = new HashSet<Integer>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println("합집합 : " + union.toString());

        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("교집합 : " + intersection.toString());

        // 차집합 : removeAll();

        System.out.println("요소 크기 : " + set.size());


    }
}
