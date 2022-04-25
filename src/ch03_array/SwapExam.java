package ch03_array;

public class SwapExam {
    public static void main(String[] args) {
        // swap : 두 변수의 값을 서로 맞바꾸는 기법
        int x = 3, y = 4;

        System.out.printf("x : %d y : %d\n", x, y);
        // swap을 적용하고자 하는 경우 동일 타입의 임시 변수를 하나 생성.
        int temp = x;   //임시 변수 정의
        x = y;
        y = temp;

        System.out.printf("x : %d y : %d", x, y);

        System.out.println();

        x = 3;
        y = 4;
        int z = 5;

        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.printf("x : %d y : %d z : %d\t", x, y, z);


        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        int cnt = arr.length / 2;
        for(int i = 0; i < cnt; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
