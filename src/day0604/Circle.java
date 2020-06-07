package day0604;

public class Circle {
//    半径r
    public double r;

    public Circle(double r) {
        this.r = r;
    }

    public double findArea(){
        return Math.PI*r*r;
    }
}
