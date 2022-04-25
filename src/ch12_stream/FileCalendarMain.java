package ch12_stream;

import java.util.Scanner;

public class FileCalendarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 년월 입력(yyyyMM) : ");
        String sDate = sc.next();   // 202104

        System.out.print("종료 년월 입력(yyyyMM) : ");
        String eDate = sc.next();   // 202105

        DateDiff diff = new DateDiff(sDate, eDate);
        String[] arr = null;
        arr = diff.calc();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        MakeCalendar2 calendar = new MakeCalendar2(arr);
        System.out.println(calendar);

        sc.close();
    }
}
