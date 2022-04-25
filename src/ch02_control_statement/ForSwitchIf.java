package ch02_control_statement;

public class ForSwitchIf {
    public static void main(String[] args) {
        int sum0 = 0, sum1 = 0, sum2 = 0;   //선언, 초기화
        for(int i = 1; i < 11; i++){
            if(i % 5 != 0)
            switch(i%3){
                case 0:
                    sum0 += i;
                    break;
                case 1:
                    sum1 += i;
                    break;
                case 2:
                    sum2 += i;
                    break;
            }
        }
        System.out.println("sum0 : " + sum0);
        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);
    }
}
