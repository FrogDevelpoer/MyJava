package ch06_inheritance.Education;

public class Student extends Person{
    private int schoolNum;
    private String grade;

    @Override
    public String toString(){
        super.Display();
        this.study();
        return "";
    }
    public void study(){
        System.out.println("학년 : " + this.grade);
        System.out.println("학점 : " + this.schoolNum);
        System.out.println(super.getName() + "이(가) 공부합니다.");
    }
    public Student(String name, int age, String address, String phone, int type, int schoolNum, String grade){
        super(name, age, address, phone, type);
        this.schoolNum = schoolNum;
        this.grade = grade;
    }
}
