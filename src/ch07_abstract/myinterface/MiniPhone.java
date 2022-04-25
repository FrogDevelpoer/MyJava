package ch07_abstract.myinterface;

public class MiniPhone extends SmartPhone{


    public MiniPhone(String phoneNo) {
        super(phoneNo);
    }

    @Override
    public boolean sendSMS() {
        System.out.println(super.getPhoneNo() + "로 문자를 보낸다요!");
         return true;
    }

    @Override
    public boolean receiveSMS() {
        System.out.println(super.getPhoneNo() + "로 부터 문자가 왔다요!");
        return true;
    }
}

