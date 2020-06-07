package day0602.demo0602;

public class TestTransfer {

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("交换结束后，变量a的值是" + a + "；变量b的值是" + b);
    }
}
