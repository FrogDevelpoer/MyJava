package ch04_method;

public class MyArrSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int result = arrsum(arr);
        System.out.println(result);
    }
    static int arrsum(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
