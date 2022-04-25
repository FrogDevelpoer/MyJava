package jongukprac;

public class Array05 {
    public static void main(String[] args) {
        double []arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println("요소들 출력하기");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("\n최대값 : " + max);
    }
}
