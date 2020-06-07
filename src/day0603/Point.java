package day0603;

public class Point {
    public static void main(String[] args) {
        Point point = new Point(1.2, 1.6, 8.5);
        point.display();
        System.out.println(point.coordSquare());

    }

    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point() {

    }

    public Point(double xCoord, double yCoord, double zCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public void setXcoord(double x) {
        xCoord = x;
    }

    public void setYcoord(double y) {
        yCoord = y;
    }

    public void setZcoord(double z) {
        zCoord = z;
    }

    public double getXcoord() {
        return xCoord;
    }

    public double getYcoord() {
        return yCoord;
    }

    public double getZcoord() {
        return zCoord;
    }

    public void display() {
        System.out.println("(" + xCoord + "," + yCoord + "," + zCoord + ")");
    }

    //各点到原点的平方
    public double coordSquare() {
        double sum = 0.0;
        sum = xCoord * xCoord + yCoord * yCoord + zCoord * zCoord;
        return sum;
    }
}
