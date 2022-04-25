package ch01_variable_operator;
/*
    연산자 우선순위
    단항 > 산술 > 이항 > 관계 > 비트 > 논리 > 조건 > 대입

    증감 연산자 : 변수의 값을 1씩 증가/감소시키기 위한 연산자
    ++ -- 2가지가 있습니다.
    위치에 따라서 전위/후위라는 용어 사용.
    ++a 전위 증가 연산자
    a-- 후위 감소 연산자
    전위는 모든 연산자 보다 먼저 실행됩니다.
    후위는 모든 연산자 보다 나중에 실행됩니다.
 */

public class PlusMinus {
    public static void main(String[] args) {
        int a = 10, b = 20, c;

        c    =  ++a   +   b++;
        //   ③   ①    ②    ④
        // ++a에 의하여 a=a+1=1+10=11
        // ②, ③에 의하여 c = 11+20=31
        // ④ b++에 의하여 b=b+1=20+1=21

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        c    =  a++   +   --b;
        //   ③   ④    ②   ①
        // ① b=b-1=21-1=0
        // ②, ③에 의하여 c=c=11+20=31
        // ④ a++에 의하여 a=a+1=11+1

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a  = 15;
        b  = 12;
        c   = --a   +  --b;
        //  ④   ①   ③   ②
        //① a=a-1=15-1=14
        //② b=b-1=12-1=11
        // ③, ④에 의하여 c=14+11=25
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}
