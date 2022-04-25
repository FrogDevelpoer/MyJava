package ch07_abstract.myshape;

public class Circle extends Shape{
    private double radius;
    private double xpos;
    private double ypos;
    @Override
    public void Display() {
        String imsi = "원의 면적 : %.3f";
        System.out.printf(imsi, super.area);
        System.out.println("\n원 중심 : (" + this.xpos + ", " + ypos + ")");
        super.draw();
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public Circle(double radius, double xpos, double ypos, String linecolor, String fillcolor) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;

        super.area = calcArea();
    }
}
