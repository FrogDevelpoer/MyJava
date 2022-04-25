package ch05_class;
/*
    static 메소드 참조시 특징
    1. static 변수
        클래스 이름으로 접근이 가능하다.
    2. instance 변수
        반드시 객체를 통하여 접근이 가능하다.
    3. static 메소드
        클래스 이름으로 접근이 가능하다.
        동일 클래스내에서는 메소드 이름으로 접근이 가능하다.
    4. instance 메소드
        반드시 객체를 통하여 접근이 가능하다.
 */
public class StaticTest {
    static int abs(int x){
        if(x < 0){
            return -x;
        }
        else{
            return x;
        }
    }
    public static void main(String[] args) {
        System.out.println("static 변수 : " + Mathematics.first);

        Mathematics math = new Mathematics();
        System.out.println("instance 변수 : " + math.second);

        int x = 3, y = 5;
        int result = Mathematics.max(x, y);
        System.out.println("최대 값 : " + result);

        result = abs(-12);
        System.out.println("절대값 : " + result);

        result = math.min(x, y);
        System.out.println("최소 값 : " + result);
    }
}
