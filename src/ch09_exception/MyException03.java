package ch09_exception;

public class MyException03 {
    public static void main(String[] args) {
        String str = "hello korea";
        int idx;
        try{
            idx = str.indexOf("asdf");
            System.out.println("asdf 위치 : " + idx);

            String temp = str.substring(0, idx);
            System.out.println(temp);
        }
        catch (StringIndexOutOfBoundsException err){
            System.out.println("문자열 추출 색인 예외 발생");
        }
        catch(Exception err){
            System.out.println("나머지 예외 발생");
        }
        finally {
            System.out.println("무조건 실행");
        }
    }
}
