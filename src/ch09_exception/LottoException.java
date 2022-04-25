package ch09_exception;

public class LottoException extends Exception{
    private int lotto;

    public LottoException(String message, int lotto){
        super(message);
        this.lotto = lotto;
    }

    @Override
    public String toString() {
        String imsi = this.lotto + "는(은) 문제 발생 번호입니다.";
        return super.toString() + "\n" + imsi;
    }
}
