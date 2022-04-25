package ch08_utility_classes;

public class WrapperTest {
    public static void main(String[] args) {
        System.out.println("int 타입이 취할 수 있는 최대값 : " + Integer.MAX_VALUE);
        System.out.println("int 타입의 메모리 크기 : " + (Integer.SIZE/8) + "바이트");
        System.out.println("long 타입이 취할 수 있는 최대값 : " + Long.MAX_VALUE);
        System.out.println("long 타입이 취할 수 있는 최대값 : " + Double.MAX_VALUE);

        int xx = 2147483647;
        System.out.println(++xx);

        // 정수 aa에 대하여 숫자를 뒤집고, bb를 합쳐보기
        // 결과 : 43215678
        int aa = 1234, bb = 5678, cc = 10;
        System.out.println("2진수 : " + Integer.toBinaryString(cc));

       // String strA = new String("" + aa);
        String strA = new String(String.valueOf(aa));
        String imsi = "";
        int len = strA.length();
        for (int i = len - 1; i >= 0; i-- ){
            imsi += strA.charAt(i);
        }
        System.out.println("aa 뒤집기 결과 : " + imsi);

        String strB = String.valueOf(bb);
        String temp = imsi + strB;
        System.out.println("결과 : " + temp);

        int su = Integer.parseInt(temp) - 15000;
        System.out.println("정수로 변경 후 15000 빼기: " + su);

        // 상품 : 코드명 + 단가 + 일련번호
        // 상품의 단가에 100원을 더하기.
        String item = "ABC123가가";
        String code = item.substring(0, 3);
        System.out.println("코드 : " + code);

        String _price = item.substring(3, 6);
        int price = Integer.valueOf(_price) + 100;
        System.out.println("100원 추가된 금액 : " + price);

        String sequence = item.substring(6);
        System.out.println("일련 번호 : " + sequence);

        String result = code + String.valueOf(price) + sequence;
        System.out.println("최종 결과 : " + result);

        // ABC123가가
        // 012345678
        // substring에서 sub는 추출의 의미. substring(0, 3)은 0부터 3 전까지.  substring(6)은 6부터 끝까지
    }
}
