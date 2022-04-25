package jongukprac.sport;

public class BaseBall extends Sports{
    private double hitrate;
    private String result;

    public BaseBall(String name, int entry, double hitrate) {
        super(name, entry);
        this.hitrate = hitrate;
        this.result = result;
        if(hitrate >= 0.35){
            result = "와!";
        }
        else if(hitrate >= 0.30){
            result = "오...";
        }
        else if(hitrate >= 0.25){
            result = "뭐하누 ㅋㅋ";
        }
        else{
            result = "그렇게 하는ㄱ ㅓ아닌ㄷ ㅔㅋㅋㄹㅃㅃ";
        }
    }

    @Override
    public void Display() {
        super.getInfo();
        System.out.println("타율 : " + this.hitrate);
        System.out.println("평가  :" + this.result);
    }
}
