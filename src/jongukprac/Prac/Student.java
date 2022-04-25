package jongukprac.Prac;

public class Student extends Person{
    private int schoolYear;
    private String grade;

    @Override
    public String toString(){
        super.Display();
        this.learn();
        return "";
    }
    private void learn(){
        System.out.println("학년 : " + this.schoolYear);
        System.out.println("학점 : " + this.grade);
        System.out.println(super.getName() + "이(가) 공부합니다.");
    }

    public Student(String name, int age, String address, String phone, int type, int schoolYear, String grade) {
        super(name, age, address, phone, type);
        this.schoolYear = schoolYear;
        this.grade = grade;
    }
}
