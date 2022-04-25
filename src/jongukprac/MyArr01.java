package jongukprac;

public class MyArr01 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int []arr = new int[3];

        arr[0] = x - y + 6;
        arr[2] = arr[0] + 3;
        arr[1] = arr[0] + arr[2];

        System.out.println("배열요소 출력하기");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] =" + arr[i]);
        }
        int []arr2 = {10, 20, 30};
        for(int i = 0; i < arr2.length; i++){
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}
