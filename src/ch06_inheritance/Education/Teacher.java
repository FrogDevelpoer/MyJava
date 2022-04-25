package ch06_inheritance.Education;

public class Teacher extends Person{
    private String subject;
    @Override
    public String toString(){
        super.Display();
        this.teach();
        return "";
    }
    public void teach(){
        System.out.println("강의 과목 : " + this.subject);
        System.out.println(super.getName() + "이(가)" + this.subject + "를 강의합니다.");
    }
    public Teacher(String name, int age, String address, String phone, int type, String subject){
        super(name, age, address, phone, type);
        this.subject = subject;
    }
}

