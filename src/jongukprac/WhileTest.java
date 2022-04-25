package jongukprac;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        double avg = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("점수를 입력 하세요: ");
            int grade = sc.nextInt();
            if(grade > 0){
                total += grade;
            }
            else{
                break;
            }
            System.out.println("점수 : " + grade);
            count++;
            avg = total / count;
        }
        System.out.println("총 시험 횟수 : " + count);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        sc.close();
    }
}
