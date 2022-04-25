package ch11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();

        lists.add("ITZY");
        lists.add("아이즈원");
        lists.add("에스파");
        lists.add("ITZY");
        lists.add("여자친구");

        int idx = -1;
        idx = lists.indexOf("아이즈원");    // 승급
        System.out.println("아이즈원의 위치 : " + idx);

        idx = lists.indexOf("girls");
        System.out.println(idx);

        // 2번째 위치에 girls 넣기
        if(lists.indexOf("girls") == -1){
            lists.add(2, "girls");
        }

        Printfor(lists);    // 원본

        lists.set(5, "2am");
        lists.remove("여자친구");

        System.out.println("오름차순 정렬 : ");
        Collections.sort(lists);
        PrintGet(lists);

        System.out.println("내림차순 정렬 : ");
        Collections.sort(lists, Collections.reverseOrder());
        PrintGet(lists);

        System.out.println(lists.toString());

        System.out.println("요소들 섞기");
        Collections.shuffle(lists);
        Printfor(lists);

        List<String> newlists = lists.subList(2, 4);
        System.out.println(newlists.toString());

        List<String> newlists2 = lists.subList(1, 3);
        List<String> newlists3 = lists.subList(4, 5);
        List<String> totallists = new ArrayList<>();
        totallists.addAll(newlists2);
        totallists.addAll(newlists3);
        System.out.println(totallists.toString());

        System.out.println("요소 크기 : " + lists.size());

    }

    private static void PrintGet(List<String> qwer) {
        System.out.println("get 메소드를 이용한 방식");
        String imsi = "";
        for (int i = 0; i < qwer.size(); i++) {
            imsi += qwer.get(i) + "\t";
        }
        System.out.println(imsi);
    }

    private static void Printfor(List<String> asdf) {  // 복사본
        System.out.println("확장 For를 출력한 데이터 출력하기");
        String imsi = "";
        for(String item: asdf){
            imsi += item + "\t";
        }
        System.out.println(imsi);
    }
}
