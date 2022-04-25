package jongukprac;

public class DoubleFor {
    public static void main(String[] args) {
        System.out.println("1번문제");
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= 5; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("2번문제");
        for(int i = 1; i <= 5; i++){
            for (int k = 1; k <= 5 ; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("3번문제");
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= 5; k++){
                System.out.print(i+k-1);
            }
            System.out.println();
        }
        System.out.println("4번문제");
        for(int i = 1; i <= 5; i++){
            for(int k = 9; k >= 5; k--){
                System.out.print(k-i+1);
            }
            System.out.println();
        }
    }
}
