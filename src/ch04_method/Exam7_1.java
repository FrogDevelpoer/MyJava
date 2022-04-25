package ch04_method;

public class Exam7_1 {
    public static void main(String[] args) {
        int x = -12;
        int result = signOf(x);
        System.out.println("결과 1 : " + result);
        System.out.println(Math.signum(x));

        x = 0;
        result = signOf(x);
        System.out.println("결과 2 : " + result);

        x = 3;
        result = signOf(x);
        System.out.println("결과 3 : " + result);
    }
    static int signOf(int x){
        if(x < 0){
            return -1;
        }
        else if(x == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
