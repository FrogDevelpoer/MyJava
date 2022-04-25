package ch03_array;
/*

 */
public class MyArr01 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        // 방법 1: new 연산자를 이용한 배열 생성
        int[] arr = new int[3];

        System.out.println("배열 요소들은 초기값이 있습니다.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        arr[0] = x - y + 6;
        arr[2] = arr[0] + 3;
        arr[1] = arr[0] + arr[2];

        System.out.println("배열 요소 출력하기");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        // 방법 2: {}를 사용한 초기화 기법
        int [] arr2 = {10, 20, 30};
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr2[" + i + "] = " + arr[i]);
        }
    }
}
