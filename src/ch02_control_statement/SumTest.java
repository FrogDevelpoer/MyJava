package ch02_control_statement;

public class SumTest {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for(int i = 1; i < 11; i++) {
            if (i % 3 == 0) {
                sum1 += i;
            }
            else{
                if(i >= 5){
                    if(i != 8){
                        sum2 += i;
                    }
                }
                else{
                    sum3 += i;
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
