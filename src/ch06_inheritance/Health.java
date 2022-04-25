package ch06_inheritance;

public class Health extends Human{
    public Health(String name, String gender, double height, double weight){
        super(name, gender, height, weight); //슈퍼 클래스에게 데이터를 넘겨줌
        this.calculate();
        this.output2();
    }
    private double s_weight = 0.0;    // 표준체중
    private double fat = 0.0;  // 비만율
    private String result = null;   // 결과 값 표시 문자열
    private void calculate(){
        System.out.println("여기서 비만도 계산");
        if (super.getGender() == "남자") {
            this.s_weight = (super.getHeight() - 100) * 0.9;
        }
        else{
            this.s_weight = (super.getHeight() - 100) * 0.85;
        }
        this.fat = super.getWeight() / this.s_weight * 100.0;

        if(this.fat >= 150.0){
            this.result = "고도 비만";
        }
        else if(this.fat >= 131.0){
            this.result = "중도 비만";
        }
        else if(this.fat >= 121.0){
            this.result = "경도 비만";
        }
        else if(this.fat >= 111.0){
            this.result = "과체중";
        }
        else if(this.fat >= 90.0){
            this.result = "정상";
        }else{
            this.result = "저체중";
        }
    }
    private void output2(){
        System.out.println("계산 결과 출력");
        String imsi = "%s님의 비만율은 %.1f이고, %s입니다.";
        System.out.printf(imsi, super.getName(), this.fat, this.result);
    }
}
