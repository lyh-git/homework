package day0606.dome01;

public class Triangle extends Shape {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public void draw(String color){
        System.out.println("画三角形"+color);
    }
    @Override
    public void draw() {
        System.out.println("画三角形");
    }


    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
       return Math.sqrt(0.5*getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)*(getPerimeter()-c));
    }
}
