package ch04_method;

public class Method08 {
    public static void main(String[] args) {
        String str = "gugudan";

        reverse(str);
        reverse(str, 2, 5);
    }
    static void reverse(String str){
        String imsi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            imsi = imsi + str.charAt(i);
        }
        System.out.println("전체 뒤집기 : " + imsi);
    }
    static void reverse(String str, int begin, int end){
        String imsi = "";
        for (int i = end; i >= begin ; i--) {
            imsi += str.charAt(i);
        }
        System.out.println(imsi);
    }
}

