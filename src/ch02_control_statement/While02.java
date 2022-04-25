package ch02_control_statement;

public class While02 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        int i = 1;
        while(i < 11){
            if(i % 2 == 0){
                even += i;
            }
            else{
                odd += i;
            }
            i++;
        }
        System.out.println("짝수의 합: " + even);
        System.out.println("홀수의 합: " + odd);
    }
}
