package day0603.demo0603.homework;

public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
        this.r = 5;
    }

    public double area() {
        return r * r * Math.PI;
    }

    public double girth() {
        return 2 * r * Math.PI;
    }

}
