package ch09_exception;

public class LessThan5Test {
    public static void main(String[] args) {
        int x = 3;
        LessThan5 error = null;
        try {
            if(x < 5){  // 예외 발생 시키기
                String message = "5 이상의 정수를 입력하셔야 합니다.";
                error = new LessThan5(message);
            throw error;    // 사용자 정의 예외 객체 호출
        }
            else{
                System.out.println("프로그램 정상");
            }
        }
        catch (LessThan5 err) {
            System.out.println("5 미만의 정수 입력됨");
            System.out.println("메시지 : " + err.getMessage());
            System.out.println("문자열 : " + err.toString());
            err.printStackTrace();
        }
    }
}
