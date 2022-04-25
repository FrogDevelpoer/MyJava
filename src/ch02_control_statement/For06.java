package ch02_control_statement;

public class For06 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i < 101; i++){
            sum += (double)1/i;    //1.0 / i로 해도 됨
        }
        System.out.println(sum);

    }
}
