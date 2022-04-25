package jongukprac.Prac;

public class Staff extends Person{
    private String department;

    @Override
    public String toString(){
        super.Display();
        this.work();
        return "";
    }
    public void work(){
        System.out.println("부서 : " + this.department);
        System.out.println(super.getName() + "이(가) " + this.department + "에서 근무합니다.");
    }
    public Staff(String name, int age, String address, String phone, int type, String department){
        super(name, age, address, phone, type);
        this.department = department;
    }
}
