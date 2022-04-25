package ch09_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LottoCheckTest {
    public static void main(String[] args) {
        Scanner scan = null ;
        int lotto = 0 ;

        try {
            scan = new Scanner(System.in) ;
            System.out.print("로또 번호 입력 : ");
            lotto = scan.nextInt() ;

            if (lotto <1 || lotto > 45) {
                String message = "잘못된 로또 번호" ;
                LottoException le = new LottoException(message, lotto) ;
                throw le ;

            } else {
                String imsi = lotto + "은(는) 올바른 로또 번호입니다.";
                System.out.println(imsi);
            }
        } catch (LottoException e) {
            System.out.println("문자열 : " + e.toString());
            System.out.println("메시지 : " + e.getMessage());
            e.printStackTrace();

        }catch (InputMismatchException e){
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("나머지 예외 발생");
            e.printStackTrace();

        } finally {
            if(scan != null) {scan.close();}
        }
    }
}
