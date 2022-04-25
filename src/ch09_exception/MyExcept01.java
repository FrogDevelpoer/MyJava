package ch09_exception;

public class MyExcept01 {
    public static void main(String[] args) {
        try{
            String xx = "aa";
            first(xx);
        }
        catch (ArithmeticException err){
            System.out.println("0으로 나눌 수 없음");
        }
        catch (NumberFormatException err){
            System.out.println("숫자 형 변환 예외 발생");
        }
        catch(Exception err){
            System.out.println("기타 예외 발생");
        }
        finally {
            System.out.println("무조건 실행되는 구문");
        }
    }

    private static void first(String xx) throws ArithmeticException, NumberFormatException{
        int x = Integer.parseInt(xx);
        second();
    }

    private static void second() {
        third();
    }

    private static void third(){
        int i = 1, j = 0;
        System.out.println(i / j);
    }
}
