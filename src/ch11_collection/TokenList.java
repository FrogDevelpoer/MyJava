package ch11_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TokenList {
    public static void main(String[] args) {
        String str ;
        str = "소녀시대 빅뱅 원더걸스";
        List<String> lists = new ArrayList<>();
        StringTokenizer st1 = new StringTokenizer(str);
        while(st1.hasMoreTokens()){
            String item = st1.nextToken();
            lists.add(item);
//            System.out.println(item);
        }
        PrintThis(lists);
    }
    private static void PrintThis(List<String> lists) {
        String imsi = "";
        for(String item : lists){
            imsi += item + "\t";
        }
        System.out.println(imsi);
    }
}
