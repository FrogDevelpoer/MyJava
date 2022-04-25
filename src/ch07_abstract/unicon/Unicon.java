package ch07_abstract.unicon;

public class Unicon implements Horse, Bird{
    private String name;
    private String gender;
    private int initspeed;

    public Unicon(String name, String gender) {
        this.name = name;
        this.gender = gender;
        if(gender =="M"){
            this.initspeed = Bird.speed;
        }
        else{
            this.initspeed = Horse.speed;
        }
    }
    public void Display(){
        String imsi = "%s의 초기 속도는 %d입니다.\n";
        System.out.printf(imsi, this.name, this.initspeed);
        this.run();
        this.fly();
    }

    @Override
    public void fly() {
        String imsi = "%s(이)가 시속 %d의 속도로 날아갑니다..\n";
        System.out.printf(imsi, this.name, Bird.speed);
    }

    @Override
    public void run() {
        String imsi = "%s(이)가 시속 %d의 속도로 달립니다..\n";
        System.out.printf(imsi, this.name, Horse.speed);
    }
}
