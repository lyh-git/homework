package day0606.dome07;

public class TestOder {
    public static void main(String[] args) {
        Order order = new Order(123,"hua");
        Order order1 = new Order(123,"yuan");
        System.out.println(order1.equals(order));

    }
}
