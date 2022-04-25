package ch02_control_statement;

public class DoubleEx02 {
    public static void main(String[] args) {
        int ch = 65; //문자 A의 아스키 코드
        int newch = 65 + 32;  //문자 a의 아스키 코드

        System.out.println((char) ch);
        System.out.println((char) newch);
        System.out.println((char) (ch + 1));

        int gatsu = 26;  //알파벳 갯수
        int largeA = 65; //대문자 A 아스키 코드

        System.out.println("\n알파벳 대문자 출력하기");
        for (int i = largeA; i <= (largeA + gatsu - 1); i++) {
            System.out.print((char) i);

        }
        System.out.println("\n알파벳 대문자 출력하기2");
        for (int i = (largeA + gatsu - 1); i >= largeA ; i--) {
            for (int j = largeA; j <= i; j++) {
                System.out.print((char) j);
                System.out.println();

            }
        }
            int gap = 32;
            System.out.println("\n대소문자 번갈아서 출력하기");
            for (int i = (largeA + gatsu - 1); i >= largeA ; i--) {
                for (int j = largeA; j <= i; j++) {
                    if(j % 2 == 1){
                        System.out.print((char)j);
                    }
                    else{
                        System.out.print((char)(j+gap));
                }
                }
                System.out.println();
        }
            System.out.println("\n소문자 출력하기");
            int smallA = 97;
            int smallZ = smallA + gatsu - 1;

        for (int i = smallA; i <= smallZ ; i++) {
            for (int j = smallA; j <= i ; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}