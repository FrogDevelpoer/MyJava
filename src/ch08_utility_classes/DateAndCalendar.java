package ch08_utility_classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    private Date date;
    private Calendar cal;
    private String pattern;
    private SimpleDateFormat sen;

    public DateAndCalendar(Date date) {
        this.date = date;
    }

    public DateAndCalendar(Calendar cal) {
        this.cal = cal;
    }

    public void getDateInfo() {
        String pattern = "yyyy년 MM월 dd일 hh시 mm분 ss초";
        this.sen= new SimpleDateFormat(pattern);
        String curdate = sen.format(this.date);
        System.out.println(curdate);
    }

    public void getCalendarInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Calendar -> Date 타입으로 변환하여 출력하기");
        long longdata = this.cal.getTimeInMillis();
        Date newdate = new Date(longdata);
        this.pattern = "오늘은 yyyy년 MM월 dd일이고, E요일이며,";
        this.pattern +=" 올해 D번째 날이며, w번째 주입니다.";
        this.sen= new SimpleDateFormat(pattern);
        String curdate = this.sen.format(newdate);
        System.out.println(curdate);

        System.out.println("----------------------------------------");
        System.out.println("Calendar 클래스의 필드 정보를 이용하여 출력하기");
        this.pattern = "오늘은 %d년 %d월 %d일이고, %S요일이며,";
        this.pattern +=" 올해 %d번째 날이며, %d번째 주입니다.";

        int year = this.cal.get(Calendar.YEAR);
        int month = this.cal.get(Calendar.MONTH) + 1;
        int day = this.cal.get(Calendar.DAY_OF_MONTH);
        int dayOfYear = this.cal.get(Calendar.DAY_OF_YEAR);
        int weekOfYear = this.cal.get(Calendar.WEEK_OF_YEAR);
        int dayOfWeek = this.cal.get(Calendar.DAY_OF_WEEK); // 요일 상수

        String weekname = "";
        switch (dayOfWeek){
            case 1 : weekname = "일";
                break;
            case 2 : weekname = "월";
                break;
            case 3 : weekname = "화";
                break;
            case 4 : weekname = "수";
                break;
            case 5 : weekname = "목";
                break;
            case 6 : weekname = "금";
                break;
            case 7 : weekname = "토";
                break;
        }
        System.out.printf(this.pattern, year, month, day, weekname, dayOfYear, weekOfYear);
    }
}
