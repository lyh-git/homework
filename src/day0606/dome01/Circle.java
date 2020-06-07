package day0606.dome01;

public class Circle extends Shape {
    public double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void draw(String color){
        System.out.println("画圆形"+color);
    }
    @Override
    public void draw() {
        System.out.println("画圆");
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
