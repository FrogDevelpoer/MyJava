package ch11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i < 20; i+=3) {
            list1.add(i);
        }
        System.out.println(list1.toString());

        int key = 10;
        int idx = Collections.binarySearch(list1, key);
        System.out.println("탐색의 반환 값 : " + idx);
        System.out.println((idx + 1) + "번째 요소");

        int startval = 1;
        int endval = 10;
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = startval; i <= endval; i++) {
            list2.add(i);
        }
        System.out.println(list2.toString());

        Collections.shuffle(list2);
        System.out.println(startval + "부터 " + endval + "까지 랜덤으로 섞어보자~!");
        System.out.println(list2.toString());

        Student array[] =
                {
                        new Student(2, "홍길동"),
                        new Student(4, "박영희"),
                        new Student(1, "강감찬"),
                        new Student(3, "김철수"),
                };

        List<Student> list3 = Arrays.asList(array);

        Collections.sort(list3);
        System.out.println("오름차순 정렬 : " + list3.toString());

        Collections.sort(list3, Collections.reverseOrder());
        System.out.println("내림차순 정렬 : " + list3.toString());
    }
}
