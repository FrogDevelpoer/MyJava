package ch07_abstract.myinterface;

public interface MobilePhone {
    public boolean sendCall();  //전화하기
    public boolean receiveCall();   //전화 받기
    public boolean sendSMS();   // 문자 전송하기
    public boolean receiveSMS();    // 문자 받기
}
