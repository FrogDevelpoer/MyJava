package ch07_abstract.myinterface;

public class SmartPhone extends PDA implements Mp3, MobilePhone{
    String phoneNo; // 전화번호
    private String songName;    // 재생할 노래

    private final String SENDER = "발신자 ";
    private final String RECEIVER = "수신자 ";

    public SmartPhone(){}

    public SmartPhone(String phoneNo, String songName) {
        this.phoneNo = phoneNo;
        this.songName = songName;
    }

    public SmartPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // MobilePhone의 추상 메소드 구현부
    @Override
    public boolean sendCall() {
        System.out.println(RECEIVER  + this.phoneNo + "에게 전화를 합니다.");
        return true;
    }

    @Override
    public boolean receiveCall() {
        System.out.println(SENDER  + this.phoneNo + "로부터 전화를 받습니다.");
        return true;
    }

    @Override
    public boolean sendSMS() {
        System.out.println(RECEIVER  + this.phoneNo + " 에게 문자를 보냅니다.");
        return true;
    }

    @Override
    public boolean receiveSMS() {
        System.out.println(SENDER  + this.phoneNo + " 로부터 문자를 받습니다.");
        return true;
    }

    //Mp3의 추상 메소드 구현부
    @Override
    public void play() {
        System.out.println(this.songName + "을(를) 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println(this.songName + "을(를) 재생 중지합니다.");
    }
}
