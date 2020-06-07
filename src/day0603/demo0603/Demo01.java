package day0603.demo0603;

public class Demo01 {
    int a;
    // 当没有显式的定义一个构造函数时
    // 系统会自动给这个类型隐式定义一个无参的构造函数
    // public Demo01() {
    // super();
    // }

    public Demo01() {
        System.out.println("调用自己写的构造函数");
    }
}
