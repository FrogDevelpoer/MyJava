package ch01_variable_operator;

public class Operation {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int x = (a >= 5) ? 5  : (a + 2);

        x += ++a;
        int y = ++a;
        y += a + --b;

        char ch3 = 'D';
        int z = ch3 >= 'A' && ch3 <= 'Z'  ? --y : x + 2;
        int result = x > y ? z - y : x + z;

        System.out.println("result : " + result);
    }
}