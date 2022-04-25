package ch04_method;

public class MyDevition {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 80};
        double result = devition(arr);
        System.out.println("결과 : " + result);
    }
    static double devition(int arr[]){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("총합 : " + total);

        double avg = (double) total / arr.length;
        System.out.println("평균 : " + avg);

        double imsi = 0.0;  //차이 제곱의 총합
        for (int i = 0; i < arr.length; i++) {
            imsi += Math.pow((avg - arr[i]), 2.0);
        }
        System.out.println("차이 제곱의 총합 : " + imsi);

        imsi /= arr.length;  //분산
        System.out.println("분산 : " + imsi);
        return Math.sqrt(imsi);
    }
}
