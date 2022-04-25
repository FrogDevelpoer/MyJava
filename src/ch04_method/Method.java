package ch04_method;

public class Method {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        int result = add(x, y);
        System.out.println(result);
    }
    static int add(int x, int y){
        return x + y;
    }
}
