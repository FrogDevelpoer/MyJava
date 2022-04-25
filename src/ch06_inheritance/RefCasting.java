package ch06_inheritance;
/*
    레퍼런스 형 변환
        상속관계에 있는 클래스간의 형변환
    승급(Upcasting) : 서브 타입의 클래스가 슈퍼 타입의 클래스로 변경되는 현상.
    강등(DownCasting) : 명시적인 형 변환을 이용하여 원래 타입으로 다시 되돌리는 것

    instanceof 연산자
        특정 객체가 어떠한 클래스로 생성된 것인지를 파악하기 위한 연산자
        주로 if구문에서 해당 객체가 맞는지 비교할 때 사용됨
    obj instanceof Book
        객체 obj는 Book 클래스의 인스턴스가 맞는지 물어봄.
 */

public class RefCasting {
    public static void main(String[] args) {
        double d = 5;       // 작은 범주의 데이터가 큰 범주로 바뀌는 경우
        System.out.println("기본 자료형의 암시적 형번환 : " + d);

        int i = (int)3.14;  // 큰 범주를 작은 범주로 변경하려면 명시적 형 변환이 필요하다.
        System.out.println("기본 자료형의 명시적 형번환 : " + i);

        // 큰타입 객체 = new 작은타입의 생성자

        String korea = new String("대한민국");
        Integer jungsu = 5;
        Book java = new Book("자바", 10000, "KOSMO");

        Display(korea);  //Object obj = new String("대한민국");
        Display(jungsu); //Object obj = 5;
        Display(java);   //Object obj = new Book("자바", 10000, "KOSMO");
    }

    private static void Display(Object obj) {
        // 입력되는 모든 데이터는 Object 타입으로 승급이 된다.
        if(obj instanceof Integer){
            // System.out.println("정수 타입");
            Integer su = (Integer)obj;
            System.out.println("정수 : " + su);
            System.out.println("정수 : " + su.toString());  // toString은 암묵적으로 항상 포함됨.
        }
        else if(obj instanceof String){
            // System.out.println("문자열 타입");
            String mystr = (String)obj; // 강등(명시적 형번환)
            System.out.println("문자열 : " + mystr);
            System.out.println("문자열 : " + mystr.toString()); // toString은 암묵적으로 항상 포함됨.
        }
        else if(obj instanceof Book){
            // System.out.println("책 타입");
            String name = ((Book)obj).getName();
            System.out.println("책이름 : " + name);

            double price = ((Book)obj).getPrice();
            System.out.println("단가 : " + price);

            String education = ((Book)obj).getEducation();
            System.out.println("교육 기관 : " + education);

            Book mybook = (Book)obj;
            System.out.println("나의 책 정보 : \n" + mybook);
        }
        else{
            System.out.println("다른 타입");
        }
    }
}

