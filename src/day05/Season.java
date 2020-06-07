package day05;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            switch (x) {
                default:
                    System.out.println("Error,请输入月份");

                case 3:
                case 4:
                case 5:
                    System.out.println(x + ":" + "春季");
                    break;

                case 6:
                case 7:
                case 8:
                    System.out.println(x + ":" + "夏季");
                    break;

                case 9:
                case 10:
                case 11:
                    System.out.println(x + ":" + "秋季");
                    break;

                case 12:
                case 1:
                case 2:
                    System.out.println(x + ":" + "冬季");
                    break;

            }

        }
    }
}
