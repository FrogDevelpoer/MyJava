package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        int x;
        int y;
        x = 3;
        y = 5;
        /*
        int x = 3;
        int y = 5;
         */
        int z;
        int n;
        z = x + y;
        n = x * y;

        System.out.print(x);
        System.out.print(" 더하기 ");
        System.out.print(y);
        System.out.print("는 ");
        System.out.print(z);
        System.out.print("입니다 ");
        System.out.println();

        System.out.print(x + " 더하기 " + y + "는 " + z + "입니다.");

        System.out.println();
        System.out.print(x + " 곱하기 " + y + "는 " + n + "입니다");



    }
}
