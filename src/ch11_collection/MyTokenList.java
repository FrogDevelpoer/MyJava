package ch11_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyTokenList {
    public static void main(String[] args) {
        String str = "소녀시대 원더걸스 빅뱅";

        StringTokenizer st1 = new StringTokenizer(str);
        int cnt_token = st1.countTokens();

        String[] arr = new String[cnt_token];

        int i = 0;
        while(st1.hasMoreTokens()){
            arr[i++] = st1.nextToken();
        }

        List<String> lists = new ArrayList<String>();

        for(String item:arr){
            lists.add(item);
        }
        Printfor(lists);
    }

    private static void Printfor(List<String> lists) {
        System.out.println("확장 for를 이용한 출력 방식");
        for(String item : lists){
            System.out.println(item);
        }
    }
}
