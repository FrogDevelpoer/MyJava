package ch04_method;

public class Exam7_2 {
    public static void main(String[] args) {
        int x = 3, y = 8, z = 5;
        int result = min(x, y, z);
        System.out.println("최소 : " + result);

        int result2 = max(x, y, z);
        System.out.println("최대 : " + result2);
    }
    static int min(int x, int y, int z){
        int result = x < y ? x : y;
        result = Math.min(result, z);
        return result;

    }
    static int max(int x, int y, int z){
        int result2 = x > y ? x : y;
        result2 = Math.max(result2, z);
        return result2;
    }
}
