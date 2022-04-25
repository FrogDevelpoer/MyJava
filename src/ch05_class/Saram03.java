package ch05_class;
/*
    접근 지정자 : 데이터의 접근 허용 범위
    pirvate : 오직 클래스 내에서만 존재
    기본 값  :동일한 패키지 내에서만 접근 가능
    public : 모든 대상에게 접근 가능

    getter와 setter
        private로 숨겨져 있는 데이터를 외부에서 참조할 수 있도록 만든 공용 메소드

    캡슐화 : 클래스 내부에 들어있는 private 변수들은 외부에 노출되어 있지 않다. 이러한 특성을 캡슐화라고 한다.
            예를들어, 통장 내의 잔액은 입금/인출/잔액 조회 등으로 확인이 가능하다.
    getter : 읽어오기
        public 반환타입 get변수첫글자만대문자(){
            return 해당변수의값;
            }
    setter : 데이터에 쓰기
        public void set변수첫글자만대문자(타입 매개변수){
            값 세팅하기
            }
    this 키워드 : 특정 개체가 변수 또는 메소드를 호출할 때 복사가 되는 특수 형태의 참조 변수

 */
public class Saram03 {
    // 인스턴스 변수는 초기 값이 존재한다.
    // 클래스 타입의 기본 값은 null이다.
    // int (0), double(0.0), boolean(false) ....
    // static 변수는 인스턴스 변수와 동등하게 초기 값을 가지고 있다.
    private String name; //클래스 밖에서 접근 불가능
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getBlood(){
        return this.blood;
    }
    public void setBlood(String blood){
        this.blood = blood;
    }
}
