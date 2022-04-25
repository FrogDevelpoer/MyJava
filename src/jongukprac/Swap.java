package jongukprac;

public class Swap {
    public static void main(String[] args) {
        int x = 3, y = 5;

        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.printf("%d, %d\n", x, y);

        int [] arr = {1, 2, 3, 4, 5};
        int cnt = arr.length/2;
        for (int i = 0; i < cnt; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
