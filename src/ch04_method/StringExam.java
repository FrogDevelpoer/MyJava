package ch04_method;

public class StringExam {
    public static void main(String[] args) {
        String str = "Korea2002";

        int len = str.length();         //문자열의 길이
        System.out.println("문자열 길이: " + len);

        char ch1 = str.charAt(4);       //내가 원하는 위치의 글자
        System.out.println("찾고자하는 글자의 위치 : " + ch1);

        String upper = str.toUpperCase();    //대문자로 변경
        System.out.println("대문자 : " + upper);

        String lower = str.toLowerCase();    //소문자로 변경
        System.out.println("소문자 : " + lower);
    }
}
