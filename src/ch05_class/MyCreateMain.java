package ch05_class;

public class MyCreateMain {
    public static void main(String[] args) {
        MyCreate phone8plus = new MyCreate();
        phone8plus.setName("iPhone 8 Plus");
        phone8plus.setPrise(1076900);
        phone8plus.setDate(20171020);
        phone8plus.setColor("Silver, Gold, Red, Space Gray");
        phone8plus.setStorage(64);

        System.out.println("제조사 : " + MyCreate.comopany );
        System.out.println("모델명 : " + phone8plus.getName());
        System.out.println("색상 : " + phone8plus.getColor());
        System.out.println("출시 가격 : " + phone8plus.getPrise());
        System.out.println("출시일 : " + phone8plus.getDate());
        System.out.println("용량 : " + phone8plus.getStorage() + "GB");

        System.out.println();

        MyCreate phone12 = new MyCreate();
        phone12.setName("iPhone 12 ProMax");
        phone12.setPrise(1490000);
        phone12.setDate(20201013);
        phone12.setColor("Graphite, Pacific Blue, Gold, Silver");
        phone12.setStorage(128);

        System.out.println("제조사 : " + MyCreate.comopany);
        System.out.println("모델명 : " + phone12.getName());
        System.out.println("색상 : " + phone12.getColor());
        System.out.println("출시 가격 : " + phone12.getPrise());
        System.out.println("출시일 : " + phone12.getDate());
        System.out.println("용량 : " + phone12.getStorage() + "GB");

        System.out.println();

        MyCreate phone13 = new MyCreate();
        phone13.setName("iPhone 13 ProMax");
        phone13.setPrise(1490000);
        phone13.setDate(20210915);
        phone13.setColor("Graphite, Sierra Blue, Silver, Gold");
        phone13.setStorage(128);

        System.out.println("제조사 : " + MyCreate.comopany);
        System.out.println("모델명 : " + phone13.getName());
        System.out.println("색상 : " + phone13.getColor());
        System.out.println("출시 가격 : " + phone13.getPrise());
        System.out.println("출시일 : " + phone13.getDate());
        System.out.println("용량 : " + phone13.getStorage() + "GB");
    }
}
