package day0602;

/**
 * @author HUA
 */
public class Circle {
// 1.编写一名为: Circle 的类, 用于描述圆;
//2.在类中定义一个实例变量用于存放半径, 并有相应的set, get方法;
//3.在类中定义一个无参数的构造方法, 初始化半径值为: 5;
//4.在类中有两个实例方法，一个用于计算并返回面积,名为: double area(); 一个用于计算并返回周长,名为: double girth();
//5.再编写主类: Test3.java；(可选)
//    在主类中用Circle类创建一个对象; 调用相应的方法计算并输出周长和面积; 改变半径为 10后，再次计算并输出周长和面积；(可选)

    private  double r=5.0;

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double girth(){
        return 2*Math.PI*r;
    }
}
