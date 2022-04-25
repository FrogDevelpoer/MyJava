package ch03_array;

public class ArrayExam2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println("행 수 : " + arr.length);
        System.out.println("0행의 열 수 : " + arr[0].length);
        System.out.println("1행의 열 수 : " + arr[1].length);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] brr = {
                {10, 20},
                {30, 40, 50},
                         };
        for(int i = 0; i < brr.length; i++){
            for (int j = 0; j < brr[i].length; j++) {
                System.out.print(brr[i][j] + "\t");
            }
        }
        }
    }

