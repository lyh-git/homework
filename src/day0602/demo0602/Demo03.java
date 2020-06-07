package day0602.demo0602;

public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        // System.out.println(demo03.add(1, 2));
        int area = demo03.getArea(3, 5);
        System.out.println(area);
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int getArea(int x, int y) {
        return x * y;
    }
}
