package ch06_inheritance;

public class MySuper2 {
    private String name;
    public void setName(){
        this.name = name;
    }
    public MySuper2() {
        System.out.println("A");
    }
    public MySuper2(String name) {
        System.out.println("D");
        this.name = name;
    }
}
