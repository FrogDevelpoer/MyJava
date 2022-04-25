package ch01_variable_operator;

public class Condition {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int result;
        result = (a >= 5) ? 5 : (a + 2);
        System.out.println(result);

        int y = 5;
        result = y % 2 == 0 ? y + 3 : y * y;
        System.out.println(result);

        int x = 3;
        y = 8;
        result = x > y ? x : y;
        System.out.println(result);

        x = 5;
        y = 12;
        String str = y % x == 0 ? "yes" : "no";
        System.out.println(str);
    }
}