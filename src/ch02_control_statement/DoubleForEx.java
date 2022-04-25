package ch02_control_statement;

public class DoubleForEx {
    public static void main(String[] args) {
        System.out.println("1번 문제");
        for(int i =1; i <= 5; i++){
            for(int k = 1; k <= 5; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("2번 문제");
        for(int i =1; i <= 5; i++) {
            for (int k = 1; k <= 5; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("3번 문제");
        for(int i =1; i <= 5; i++) {
            for (int k = 1; k <= 5; k++) {
                System.out.print(i+k-1);
            }
            System.out.println();
        }
        System.out.println("4번 문제");
        for(int i =1; i <= 5; i++) {
            for (int k = 9; k >= 5; k--) {
                System.out.print(k-i+1);
            }
            System.out.println();
        }
    }
}
