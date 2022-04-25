package mypackage;

public class MyPackOne {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    public void one(){
        System.out.println(this.getClass());
        System.out.println("MyPackOne클래스의 one 메소드 호출 됨");
    }
}
