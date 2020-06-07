package day0602;

public class Test3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area());
        System.out.println(circle.girth());
        circle.setR(10);
        System.out.println(circle.area());
        System.out.println(circle.girth());



    }
}
