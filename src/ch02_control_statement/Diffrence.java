package ch02_control_statement;

public class Diffrence {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;

        for(int i = 1; i < 51; i++){
            if(i % 3 == 0){
                sum2 += i;
            }
            else{
                sum1 += i;
            }
        }
        System.out.println("두 수의 차는: "+ (sum1 - sum2));
    }
}
