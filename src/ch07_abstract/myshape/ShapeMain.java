package ch07_abstract.myshape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape =
                {
                        new Rectangle(20.0, 10.0, "red", "blue"),
                        new Triangle(30.0, 10.0, "yellow", "pink"),
                        new Circle(5.0, 3.0, 4.0, "pink", "blue")
                };
        for (int i = 0; i < shape.length; i++) {
            shape[i].Display();
            System.out.println();
        }
    }
}
