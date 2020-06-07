package day0606.dome06;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("黑色", 5);
        Circle circle1 = new Circle("黑色", 5);
        System.out.println(circle1.equals(circle));
        System.out.println(circle1.color.equals(circle.color));
        System.out.println(circle1.toString());
        System.out.println(circle.toString());
    }
}
