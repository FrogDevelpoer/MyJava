package ch08_utility_classes;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "자바 너무 재밌다 그치";

        System.out.println("기본 값으로 해당 문자열을 공백으로 나누어 토큰을 생성해준다.");
        StringTokenizer st1 = new StringTokenizer(str);
        System.out.println("토큰 개수 : " + st1.countTokens());

        while(st1.hasMoreTokens()){
            String item = st1.nextToken();
            System.out.println(item);
        }
        System.out.println();

        str = "자바/너무/재밌다/그치";
        // 구분자(delimiter)를 지정할 수 있다.
        StringTokenizer st2 = new StringTokenizer(str, "/");
//        while(st2.hasMoreTokens()){
//            String item = st2.nextToken();
//            System.out.println(item);
//        }
        System.out.println();

        System.out.println("for구문 사용하기");
        int su = st2.countTokens();
        for (int i = 0; i < su; i++) {
            String item = st2.nextToken();
            System.out.println(item);
        }
        System.out.println();

        str = "자바/너무/재밌다/그치";
        // 세번째 매개 변수가 true이면 delimiter를 보존
        StringTokenizer str3 = new StringTokenizer(str, "/", true);
        while(str3.hasMoreTokens()){
            String item = str3.nextToken();
            System.out.println(item);
        }

        System.out.println();

        str = "id=hong&password=1234&address=철산동";
        StringTokenizer str4 = new StringTokenizer(str, "&");
        while(str4.hasMoreTokens()){
            String token = str4.nextToken();
            StringTokenizer str5 = new StringTokenizer(token, "=");
            while (str5.hasMoreTokens()){
                System.out.print(str5.nextToken() + "\t");
            }
            System.out.println();
        }

        System.out.println();

        str = "id=hong&password=1234&address=철산동";
        StringTokenizer str6 = new StringTokenizer(str, "&");
        while (str6.hasMoreTokens()){
            String token = str6.nextToken();
            int idx = token.indexOf("=");
            String left = token.substring(0, idx);
            String right = token.substring(idx + 1);
            System.out.println(left + " : " + right);
        }
    }
}
