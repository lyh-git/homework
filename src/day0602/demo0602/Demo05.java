package day0602.demo0602;

public class Demo05 {

    public static void main(String[] args) {
        mOL(2);
        mOL(2, 3);
        mOL("打印信息");
    }

    public static void mOL(int a) {
        System.out.println(Math.pow(a, 2));
    }

    public static void mOL(int a, int b) {
        System.out.println(a * b);
    }

    public static void mOL(String message) {
        System.out.println(message);
    }
}
