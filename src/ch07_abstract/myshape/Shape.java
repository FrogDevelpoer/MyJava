package ch07_abstract.myshape;

public abstract class Shape {
    double area;
    private String linecolor;
    private String fillcolor;

    public Shape(){}

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;

    }
    public final void draw(){
        System.out.println("라인 색상 : " + this.linecolor);
        System.out.println("채우기 색상 : " + this.fillcolor);
    }
    public abstract void Display();
    public abstract double calcArea();
}
