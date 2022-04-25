package ch06_inheritance;

public class Human{
    private String name;
    private String gender;
    private double height;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Human(String name, String gender, double height, double weight){
        this.name = name;
        if(gender == "M"){
            this.gender = "남자";
        }
        else{
            this.gender = "여자";
        }
        this.height = height;
        this.weight = weight;
        this.output1();      // this 붙혀도 되고 없어도 됨
    }
        private void output1(){
        String imsi = "이름 : %s, 성별 : %s, 키 : %.1f, 몸무게 : %.1f\n";
        System.out.printf(imsi, name, gender, height, weight);
    }
}
