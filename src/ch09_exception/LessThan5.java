package ch09_exception;

public class LessThan5 extends Exception{
    private String message;
    public LessThan5(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "오버라이딩 : " + this.message;
    }
}
