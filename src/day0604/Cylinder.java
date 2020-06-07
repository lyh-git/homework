package day0604;

public class Cylinder extends Circle{
    public double height;

    public Cylinder(double r) {
        super(r);
    }

    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }

    @Override
    public double findArea() {
        return 2*Math.PI*r*height+2*Math.PI*r*r;
    }
    public double finVolume(){
        return 2*Math.PI*r*height;
    }
}
