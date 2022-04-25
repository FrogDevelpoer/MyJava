package ch07_abstract.myinterface;

public class PhoneMain01 {
    public static void main(String[] args) {
        String phoneNo = "01012345678";
        String songName = "광화문 연가";

        SmartPhone phone01 = new SmartPhone(phoneNo, songName);
        phone01.sendCall();
        phone01.play();

        System.out.println("계산기 호출");
        int x = 3, y = 5;
        int result = phone01.calculate(x, y);

        String imsi = "계산 결과 : %d\n";
        System.out.printf(imsi, result);

        phone01.receiveSMS();
        phone01.stop();
    }
}
