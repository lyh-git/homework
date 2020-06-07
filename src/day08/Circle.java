package day08;

import org.junit.Test;

public class Circle {
    @Test
    public  void test() {
        Circle circle = new Circle();
        circle.setR(5);
        System.out.println("面积为："+circle.area());


    }
    private double r;
    private static double PI=Math.PI;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double area(){
        return PI*r*r;
    }
}
