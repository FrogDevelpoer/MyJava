package ch07_abstract.sports;

public class BaseBall extends Sports{
    private double hitrate;
    private String result;

    @Override
    public void Display() {
        super.Display();
        super.getInfo();
        System.out.println("타율 : " + this.hitrate);
        System.out.println("평가 : " + this.result);
    }



    public BaseBall(String name, int entry, double hitrate) {
        super(name, entry);
        this.hitrate = hitrate;

        if(hitrate >= 0.35){
            result = "Very Good";
        }
        else if(hitrate >= 0.30){
            result = "Good";
        }
        else if(hitrate >= 0.25){
            result = "Normal";
        }
        else{
            result = "Shit";
        }
    }
}
