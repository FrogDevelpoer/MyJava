package ch07_abstract.myshape;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height, String linecolor, String fillcolor) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;

        super.area = this.calcArea();
    }

    @Override
    public void Display() {
        System.out.println("사각형의 면적 : " + super.area);
        super.draw();
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }
}
