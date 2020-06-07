package day05;

public class OddSum {
    public static void main(String[] args) {
        int a = 0;
        int num=100;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                a += i;
            }
        }
        System.out.print(a);
    }
}
