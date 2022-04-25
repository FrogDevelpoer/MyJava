package ch05_class;
/*
    생성자 : 객체가 생성될 때, 자바 시스템이 스스로 한번만 호출해주는 특수 메소드
    기본 생성자 : 눈에 보이지 않는 생성자가 하나 존재.
    특징 : 오버로딩이 가능. 생성자이름은 클래스 이름과 반드시 동일해야한다.
            인스턴스 변수들을 초기화하는데 사용한다. 초기화가 필요한 부분이 생성자에 코딩.
            개발자가 생성자를 구현할 수 있음.
            생성이 되면 기본 생성자는 사라짐.
    작성 방법 :
            메소드 작성 규칙을 따르되, 반환 타입은 작성하지 않음.
            접근지정자 생성자이름(매개변수 리스트){
            TODOLIST...
            }
 */
public class SaramMain04 {
    public static void main(String[] args) {
        // 클래스 이름   개체 = new 생성자 이름
        Saram04 soo = new Saram04();
        soo.Display();
        System.out.println();

        Saram04 hee = new Saram04("박영희", 162.5, 50.0, "운동", "B");
        hee.Display();
        System.out.println();

        Saram04 sin = new Saram04("김유신", 175.6, 70.4, "AB");
        sin.Display();
    }
}
