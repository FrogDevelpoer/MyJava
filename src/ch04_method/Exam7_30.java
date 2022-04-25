package ch04_method;

public class Exam7_30 {
    public static void main(String[] args) {
        int a = 3, b = 8, c = 4;
        int[] arr = {20, 50, 10, 30};
        int result;
        result = min(a, b);
        System.out.println("최소값: " + result);

        result = min(a, b, c);
        System.out.println("최소값: " + result);

        result = min(arr);
        System.out.println("최소값: " + result);
    }
    static int min(int a, int b) {
        int result =  Math.min(a, b);
        //a > b ? a : b;로도 사용 가능
        return result;
    }

    static int min(int a, int b, int c) {
        int result =  Math.min(a, b);
        result = Math.min(result, c);
        return result;
    }
    static int min(int arr[]){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(result > arr[i]){
                result = arr[i];
            }
        }
        return result;
    }
}