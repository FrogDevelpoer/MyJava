package ch09_exception;
/*
    try-catch 구문에서 catch는 여러번 사용 가능하다.(O)
    try-catch 구문에서 catch는 사용하지 않아도 된다.(X)
    try-catch 구문은 중첩이 가능하다.(O)
 */
public class MinJumsuException extends Exception{
    private String message;
    public MinJumsuException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return "메시지 : " + this.message;
    }

    @Override
    public String toString() {
        return "예외 문자열 : " + this.message;
    }
}
