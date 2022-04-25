package jongukprac;

public class DoubleEx {
    public static void main(String[] args) {
        int ch = 65;
        int newch = 65+32;

        System.out.println((char)ch);
        System.out.println((char)newch);
        System.out.println((char)(ch + 1));

        int gatsu = 26;
        int largeA = 65;

        System.out.println("\n알파벳 대문자 출력하기");
        for(int i = largeA; i <= (largeA + gatsu - 1); i++){
            System.out.print((char) i);
        }
        System.out.println("\n알파벳 대문자 출력하기2");
        for(int i = (largeA + gatsu - 1); i >= largeA; i--){
            for (int j = largeA; j <= i; j++) {
                System.out.print((char)j);
                System.out.println();
            }
        }
        int gap = 32;
        System.out.println("\n대소문자 번갈아서 출력하기");
        for(int i = (largeA + gatsu - 1); i >= largeA; i--){
            for(int j = largeA; j <= i; i++){
                if (j % 2 == 1) {
                    System.out.print((char)j);
                }
                else{
                    System.out.println((char)(j+gap));
                }
            }
            System.out.println();
        }
    }
}
