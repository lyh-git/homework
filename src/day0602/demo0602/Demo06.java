package day0602.demo0602;

public class Demo06 {

    public static void main(String[] args) {
        System.out.println(max(55, 7));
        System.out.println(max(55.5, 77.7));
        System.out.println(max(12.5, 1.76, 8.7));
        String str = "Hello Java你好";
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b, double c) {
        double max = a >= b ? a : b;
        max = max >= c ? max : c;
        return max;
    }
}
