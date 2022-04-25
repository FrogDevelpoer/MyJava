package ch06_inheritance;
/*
    Object클래스
        모든 클래스들의 최상위 클래스
        암시적으로 모든 클래스는 Object를 상속받고 있다.
    주요 메소드
        toString( ) :
            객체에 대한 정보를 문자열 형태로 보여준다.
            getClass( ) + "@" + 해시코드의 16진수 값
            객체 이름을 출력하는 경우 암시적으로 toString( ) 메소드를 호출함.
        getClass( ) : 객체의 클래스 정보를 Class 형태로 보여준다.
        hashCode( ) : 해당 객체의 해시 코드정보를 알려줌.
 */
public class ObjectEx {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();

        int hashcode = obj1.hashCode();
        System.out.println("해시 코드 : " + hashcode);

        String hexa = Integer.toHexString(1324119927);
        System.out.println("해시 코드(16진수) : " + hexa);

        String temp = obj1.toString();
        System.out.println("객체 정보1 : " + temp);
        System.out.println("객체 정보2 : " + obj1);
    }
}
