package ch01_variable_operator;

public class CondOper {
    public static void main(String[] args) {
        int x = 3, y = 8, z = 4;
        int max = x > y ? x : y;
        max = max > z ?  max : z;
        System.out.println("최대 : " + max);

        int min = x < y ? x : y;
        min = min < z ? min : z;
        System.out.println("최소 : " + min);

        //최대값을 구하되, 조건 연산자를 중첩하여 풀기
        max = x > y  && y > z ? x : y;
        // max = x > y ? (x > z ? x : z) : (y > z ?  : z);
        System.out.println("최대: " + max);

        min = x < y || y < z ? x : y;
        System.out.println("최소 : " + min);
        // min = x < y ? (x < z ? x : z) : (y < z ? y : z);
    }
}