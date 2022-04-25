package ch09_exception;

public class MyException01 {
    public static void main(String[] args) {
        int x = 3, y = 0;
        int[] arr = {10, 20, 30};
        try{
            int z = 5;
            System.out.println("아직 예외 발생안됨");
            arr[3] = 50;    // 배열 요소 인덱스 문제
            System.out.println(x / y);
            System.out.println("예외 발생하면 실행안됨");
        }
        catch(ArithmeticException ex){
            System.out.println("아 ㅋㅋ 0으로 못나눈다고 ㅋㅋ");
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println("배열 첨자 오류 발생");
            System.out.println("예외 객체 정보 확인");
            System.out.println("관련 메세지 : " + err.getMessage());
            System.out.println("관련 문자열 : " + err.toString());
            err.printStackTrace();  // 오류내용을 추적하여 메세지들을 출력.
        }
        catch(Exception ex){
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }
        finally {
            System.out.println("무적건 실행");
        }


//        if(y == 0){
//            System.out.println("0으로 어떻게 나눔ㅋㅋ");
//        }
//        else {
//            System.out.println(x / y);  // 0으로 나누고자 할 때 발생
//        }
    }
}
