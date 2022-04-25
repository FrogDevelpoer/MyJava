package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x = 5; // =기호는 대입/할당 연산자

        //+= 를 복합 대입 연산자라고 합니다.
        x += 3;   // x = x + 3
        System.out.println("x : " + x);

        int total = 0;  //초기화
        total += 1;
        total += 2;
        total += 3;
        total += 4;
        total += 5;
        total += 6;
        total += 7;
        total += 8;
        total += 9;
        total += 10;
        System.out.println("total : " + total);

    }
}
