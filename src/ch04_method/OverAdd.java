package ch04_method;
/*
    메소드 3요소 = 반환 타입 + 메소드 이름 + 매개변수 리스트
                = 메소드  signature
    오버로딩(overloadging)
        메소드 이름만 동일하게 작성하고, 매개 변수의 타입 또는 갯수를 다르게 정의하는 것
        다중 정의
    오버로딩 이유 :
        동일한 이름의 메소드를 사용하면 사용자 입장에서 가독성이 좋아짐, 데이터의 유형에 구애받지 않고 자유롭게 사용가능
    사용 예시
        Add(3, 5)                   void Add(정수, 정수)
        Add(1.1, 2.0)               void Add(정수, 정수)
        int result = Add(3, 5, 7)   int Add(정수, 정수, 정수)
        Add(100, 200)               void Add(정수, 정수) X
        Add(2.0, 3.0)               void Add(실수, 실수) X
        Add(5, 4.0)                 void Add(정수, 실수)

        위 예시에서 오버로딩 갯수는 : 4개
        이론적으로 오버로딩은 최대 무한대까지 가능하다. -> 매개변수를 많이 만들면 되지만 사람이 못따라간다.
    오버로딩 예시
        Math.abs(), Math.min(), Math.max()
 */
public class OverAdd {
    public static void main(String[] args) {
        Add(3, 5);
        Add(1.1, 2.0);
        int result = Add(3, 5, 7);
        System.out.println("반환결과: " + result);
        Add(100, 200);
        Add(2.0, 3.0);
        Add(5, 4.0);
    }
    static void Add(int x, int y){
        System.out.println("정수형 x + y =" + (x+y));
    }
    static void Add(double x, double y){
        System.out.println("실수형 x + y =" + (x+y));
    }
    static int Add(int x, int y, int z){
        return x + y + z;
    }
}
