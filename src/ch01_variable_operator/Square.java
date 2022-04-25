package ch01_variable_operator;

public class Square {
    public static void main(String[] args) {
        double width = 10.0;
        double height = 5.0;
        double area = width * height;
        double perimeter = (width * 2) + (height * 2);

        System.out.println("사각형의 넓이는: " +area);
        System.out.println("사각형의 둘레는: " + perimeter);
    }
}
