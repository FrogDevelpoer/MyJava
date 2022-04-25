package ch08_utility_classes;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 랜덤 값 추출");
            System.out.println("float 타입의 난수 : " + rand.nextFloat());
            System.out.println("boolean 타입의 난수 : " + rand.nextBoolean());
            System.out.println("int 타입의 난수 : " + rand.nextInt());
            System.out.println("long 타입의 난수 : " + rand.nextLong());
            System.out.println("double 타입의 난수 : " + rand.nextDouble());
            System.out.println("Gaussian 타입의 난수 : " + rand.nextGaussian());
            System.out.println();
        }
        int start = -5;
        int end = 8;
        int gaesu = 10;
        int mybound = end - start + 1;

        int[] array = new int[gaesu]; // 데이터를 저장할 배열

        System.out.println(start + "부터 " + end + " 사이의 임의의 정수" + gaesu + "개 추출");
        for (int i = 1; i <= gaesu; i++) {
            int num = rand.nextInt(mybound) + start;
            System.out.println(i + "번째 난수" + num);
            array[i-1] = num;
        }
        System.out.println("배열 요소 값 출력");
        for(int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "] =" + array[i]);
        }

        // 5부터 8 사이의 임의 정수 5개 출력
        int num1 = 5;
        int num2 = 8;
        int count = 5;
        mybound = num2 - num1 + 1;
        for(int i = 1; i <= count; i++){
            int sn = rand.nextInt(mybound) + num1;
            System.out.println(i + "번째 난수 : " + sn);
        }
    }
}
