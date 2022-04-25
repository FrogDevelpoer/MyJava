package ch08_utility_classes;

public class MyStringExam {
    public static void main(String[] args) {
        String str = "lastgodfather";

        System.out.println("현재 문자열: " + str);
        int at = str.indexOf("t");
        int dt = str.lastIndexOf("t");

        String temp = str.substring(at + 1, dt);
        System.out.println("추출된 문자열 : " + temp);

        String imsi = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            imsi += temp.charAt(i);
        }
        System.out.println("추출된 문자열 : " + imsi);

    }
}
