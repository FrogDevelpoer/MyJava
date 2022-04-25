package ch08_utility_classes;

import java.util.Calendar;
import java.util.Date;

public class DateConverter {
    public static void main(String[] args) {
        Date date = new Date();
        DateAndCalendar obj1 = new DateAndCalendar(date);
        obj1.getDateInfo();

        Calendar cal = Calendar.getInstance();
        DateAndCalendar obj2 = new DateAndCalendar(cal);
        obj2.getCalendarInfo();

    }
}
