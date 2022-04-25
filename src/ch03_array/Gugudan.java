package ch03_array;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 단수 입력 : ");
        int begin = sc.nextInt();
        System.out.print("끝 단수 입력 : ");
        int end = sc.nextInt();

        if(begin < 0){
            begin = Math.abs(begin);
        }
        end = end < 0 ? -end : + end;

        if(begin > end){
            int temp;
            temp = begin;
            begin = end;
            end = temp;
    }
        int row = end - begin + 1;
        int col = 9;

        int [][]arr = new int [row][col];

        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                arr[i][j] = (i + begin) * (j + 1);
                String imsi = (i + begin) + "*" + (j + 1) + "=" + arr[i][j] + "  " ;
                System.out.print(imsi);
            }
            System.out.println();
        }
        sc.close();
    }
}
