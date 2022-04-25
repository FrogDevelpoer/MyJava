package ch04_method;
/*
    이미 알고있는 메소드
    println() : 문자열을 출력 후 엔터키 누름
    printf() : 서식 지정자를 이용한 문자열 출력
    Math.abs : 절대값을 구해주는 메소드

    변수 : 정적(특정 시점 상태의 저장)
    메소드 : 동적(어떠한 역할/기능을 수행)
    매개 변수 : 메소드에게 입력해주는 외부 데이터/인수, 인자 파라미터의 용어로 불리기도한다.
    3가지 요소 : 메소드 이름, 매개 변수, 반환 타입
    특징 : 메소드는 다른 메소드와 동등한 위치에서 코딩되어야 한다.
          메소드 안에 메소드 작성을 할 수 없다.
          소괄호가 있으면 무조건 메소드이다.
    매개변수 작성 규칙: 매개 변수는 소괄호 안에 작성.
                     매개 변수가 2개 이상이면 , 로 구분.
                     매개 변수 이름은 통상적으로 x, y, m, n 등으로 작성합니다.
                     형식)타입01 이름01, 타입02 이름02, ...
                     ex) int x, int y
    메소드 작성 형식
        static 반환 타입  메소드 이름(매개변수리스트){
            todolist...
            return 반환값;
            }
    메소드 호출
    return 구문 : 최종 결과 값을 호출한 곳으로 되돌려 주기 위한 구문

    지역 변수 : 메소드 내에서만 국한되는 변수
    메소드 : 지역

    메소드 사용 이유 : 재사용성(동일한 형태의 코드를 반복적으로 사용하지 않기 위해서)

    void 키워드 : 메소드가 값을 반환하지 않을 때 사용하는 키워드
                 return 키워드를 사용하지 않는다.
 */
public class Method01 {
    public static void main(String[] args) {
        int x = 3;
        int hohoho = plus5(x);  // 호출하는
        System.out.println("결과 : " + hohoho);

        for (int i = 0; i < 3; i++) {
            hohoho = plus5(i);
            System.out.println("결과 : " + hohoho);
        }
    }
    //메소드 호출/구현
    static int plus5(int x){  // 호출받는
        int result = x + 5;
        return result;
    }
}
