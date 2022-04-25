package ch03_array;

public class Array05 {
    public static void main(String[] args) {
        double[] arr = new double[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.random();
        }
        System.out.println("요소들 출력하기");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        double max = arr[0];  //0번째 요소가 가장 크다고 가정하고 변수 max에 저장.
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];   // 최대 값이 i 번째 요소보다 작으면, i번째 요소 값을 최대 값으로 대체.
            }
        }
        System.out.println("\n최대값: " + max);
    }
}
