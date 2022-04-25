package ch01_variable_operator;

public class Time {
    public static void main(String[] args) {
        int TIME = 4000;
        int second;
        int minute;
        int hour;

        hour = TIME/3600;
        minute = (TIME - hour * 3600) / 60;
        second = TIME % 60;

        System.out.print(TIME + "초는 ");
        System.out.print(hour + "시간 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초 입니다.");
    }
}
