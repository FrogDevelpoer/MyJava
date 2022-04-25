package ch07_abstract.myshape;

public class Triangle extends Shape{
    private double width;
    private double height;
    public Triangle(double width, double height, String linecolor, String fillcolor) {
        super(linecolor, fillcolor);
        this.height = height;
        this.width = width;

        super.area = this.calcArea();
    }

    @Override
    public void Display() {
        System.out.println("삼각형의 면적 : " + super.area);
        super.draw();
    }

    @Override
    public double calcArea() {
        return (this.width * this.height) / 2;
    }
}
