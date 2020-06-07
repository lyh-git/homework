package day05;

public class Count {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                a += 1;
                sum += i;
            }
        }
        System.out.println("个数： " + a);
        System.out.println("总和： " + sum);

    }
}
