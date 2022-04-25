package ch02_control_statement;

public class WhilePlus {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while(i < 101){
            sum += i;
            i += 3;
        }
        System.out.println(sum);

        sum = 0;
        i = 97;
        while(i > 1){
            sum += i;
            i -= 5;
        }
        System.out.println(sum);

        sum = 0;
        i = 1;
        while(i < 97){
            sum += i * i;
            i += 5;
        }
        System.out.println(sum);
    }
}
