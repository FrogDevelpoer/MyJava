package ch03_array;

public class ArrayExam {
    public static void main(String[] args) {
        int su = -12;
        int su2 = Math.abs(su);
        System.out.println(su2);
        // 배열의 음수를 절대값으로 변경
        double[] arr = {1.1, -2.2, -3.3};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = Math.abs(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        int[] a = {10, -20, 30, -40, 50};
        int cnt = a.length / 2;
        int temp;

        for(int i = 0; i < cnt; i++){
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i]  = temp;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0){
                a[i] = Math.abs(a[i]);
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
