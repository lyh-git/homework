package day0602.demo0602;

public class Calculator {
    // 返回两个整数的和
    int add(int x, int y) {
        return x + y;
    }

    // 没有构成重载 因为参数列表相同 与返回值无关
    // double add(int x, int y) {
    // return (double) x + y;
    // }

    // 返回三个整数的和
    int add(int x, int y, int z) {
        return x + y + z;
    }

    // 返回两个小数的和
    double add(double x, double y) {
        return x + y;
    }

    public void method(int a) {
        System.out.println("int");
    }

    public void method(Integer a) {
        System.out.println("Integer");
    }

}
