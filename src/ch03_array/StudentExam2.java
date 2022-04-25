package ch03_array;

import java.util.Scanner;

public class StudentExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수 입력");
        int row = sc.nextInt();
        int col = 3;
        String[] name = new String[row];
        double[][] jumsu = new double[row][col];

        for (int i = 0; i < row; i++) {
            System.out.print(i + "번째 학생 이름 입력: ");
            name[i] = sc.next();
            for (int j = 0; j < col; j++) {
                System.out.print(j + "번째 점수 입력");
                jumsu[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < row; i++) {
            double total = 0.0;
            for (int j = 0; j < col; j++) {
                total += jumsu[i][j];
            }
            double avg = total / col;
            String imsi = "\n%d 번째 학생의 정보\n";
            imsi += "이름 : %s, 총점 : %.2f, 합계 : %.2f";
            System.out.printf(imsi, (i+1), name[i], total, avg);
        }
        sc.close();
    }
}
