package ch02_control_statement;
/*
    while 사용 형식
    초기식;
    while(조건식){
        todolist....
        증감식;
        }
 */

public class While01 {
    public static void main(String[] args) {


        int total = 0;

        int i = 1;
        while (i < 11) {
            total += i;
            i++;
        }
        System.out.println("총합: " + total);
    }
}
