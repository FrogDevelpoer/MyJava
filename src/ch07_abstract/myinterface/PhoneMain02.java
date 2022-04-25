package ch07_abstract.myinterface;

public class PhoneMain02 {
    public static void main(String[] args) {
        String phoneNo = "01012345678";

        MiniPhone smartphone = new MiniPhone(phoneNo);

        smartphone.sendSMS();
        smartphone.receiveSMS();
    }
}
