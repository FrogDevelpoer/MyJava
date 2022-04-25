package ch08_utility_classes;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();  // 추상 메소드
        System.out.println(now);

        // 캘린더객체.get(연관필드)
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        String imsi = year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초";
        System.out.println(imsi);
    }
}
