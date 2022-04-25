package ch05_class;

public class Mathematics {
    public static String first = "첫번째";   // static 변수
    public String second = "두번째";   // instance 변수
    // 최대 값을 구해 주는 static 메소드
    public static int max(int x, int y){
        int result = x > y ? x : y;
        return result;
    }
    //최소 값을 구해주는 instance 메소드
    public int min(int x, int y){
        int result = x < y ? x : y;
        return result;
    }
}
