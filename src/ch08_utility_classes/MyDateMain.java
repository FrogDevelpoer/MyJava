package ch08_utility_classes;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2022, 1, 28);

        MyDate date2 = new MyDate(2022, 1, 28);

        // 객체1.equals(객체2)
        if(date1.equals(date2)){    // 승급
            System.out.println("두 객체가 동일함");
        }
        else{
            System.out.println("두 객체가 상이함");
        }
    }
}
