package day0603.demo0603.homework;

public class Test01 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area());
        System.out.println(circle.girth());
        circle.setR(10);
        System.out.println(circle.area());
        System.out.println(circle.girth());
    }
}
