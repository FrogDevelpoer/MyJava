package ch04_method;

public class Method06 {
    public static void main(String[] args) {
        int x = 3, y = 6;

        int res1 = jegob(x, y);
        int res2 = max(x, y);
        sub(res1, res2);

    }
    static void sub(int res1, int res2){
        String imsi = "%d 빼기 %d 은(는) %d입니다.\n";
        System.out.printf(imsi, res1, res2, (res1-res2));
    }
    static int max(int x, int y){
        String imsi = x + "와" + y + "중에서 큰 수를 구해줍니다.";
        System.out.println(imsi);
        return Math.max(x, y);
    }
    static int jegob(int x, int y){
        return square(x) + square(y);
    }

    private static int square(int x) {
        String imsi = x  +"의 제곱 값을 구해줍니다.";
        System.out.println(imsi);
        return x * x;
    }
}
