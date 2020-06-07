package day0603;
/*编写两个类，TriAngle和TestTriAngle， 其中TriAngle中声明私
        有的底边长base和高height,同时声明公共方法访问私有变
        量;另一个类中使用这些公共方法，计算三角形的面积。*/

public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
