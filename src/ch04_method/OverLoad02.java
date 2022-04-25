package ch04_method;

public class OverLoad02 {
    public static void main(String[] args) {
        overload("굿모닝", 5);
        overload(10);
        overload('a', 'A', 'f');
        overload(2.0, 3.0);
    }
    static void overload(String str, int cnt){
        for (int i = 1; i <= cnt; i++) {
            System.out.println(str);
        }
    }
    static void overload(int n){
        int result = 0;
        for(int i = 0; i <= n; i++){
            result += i;
        }
        System.out.println("총합 : " + result);
    }
    static void overload(char x, char y, char z){
        char result = x > y ? x : y;
        result = result > z ? result : z;
        System.out.println("최대 : " + result);
    }
    static void overload(double x, double y){
        double imsi = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println("제곱의 합 : " + imsi);
    }
}
