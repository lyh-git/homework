package day0606.dome01;

public class Rectangle extends Shape{
    public double length;
    public double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    public void draw(String color){
        System.out.println("画矩形"+color);
    }

    @Override
    public void draw() {
        System.out.println("画矩形");
    }

    @Override
    public double getPerimeter() {
       return 2*(length+height);
    }

    @Override
    public double getArea() {
       return length*height;
    }
}
