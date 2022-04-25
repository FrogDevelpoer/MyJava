package ch08_utility_classes;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
    }

    @Override   // 오버라이딩된 equals 메소드를 사용하여 값 비교를 수행
    public boolean equals(Object target) {
        MyDate mydate =(MyDate)target;  // 강등
        // 년도, 월, 일 각각 비교를 수행 후 진위 값을 반환함.
        boolean result = this.year == mydate.year && this.month == mydate.month && this.day == mydate.day;

        return result;
    }
}
