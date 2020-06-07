package day05;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int soc = scanner.nextInt();
            switch (soc / 60) {
                case 1:
                    System.out.println("及格");
                    break;
                case 0:
                    System.out.println("不及格");
                    break;
                default:
                    System.out.println("成绩输入有误");
                    break;
            }
        }
    }
}
