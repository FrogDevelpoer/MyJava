package ch01_variable_operator;

public class PrintMe {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 27;
        double height = 175.85;
        float weight = 55.7f;
        char munja = 'Z';      //문자는 글자 1개 (반드시 외따옴표')
        boolean bool = true;

        System.out.println("키: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);
        System.out.println("문자: " + munja);
        System.out.println("진위 : " + bool);

    }
}
