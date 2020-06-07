package DAY04;

import java.util.Scanner;

public class ComparisonSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("第一个数");

        int num1 = scanner.nextInt();

        System.out.println("第二个数");

        int num2 = scanner.nextInt();

        System.out.println("第三个数");

        int num3 = scanner.nextInt();

        if (num1 > num2) {
            //根据情况将num3放到对应位置
            if (num3 > num1)//3 1 2
            {
                System.out.println(num2 + "" + num1 + "" + num3);
            } else if (num3 > num2)//3 2 1
            {
                System.out.println(num1 + "" + num2 + "" + num3);
            } else//1 2 3
            {
                System.out.println(num3 + "" + num2 + "" + num1);
            }
        } else {
            //根据情况将num3放到对应位置
            if (num3 > num2) {
                System.out.println(num1 + "" + num2 + "" + num3);
            } else if (num3 > num1)//2 3 1
            {
                System.out.println(num1 + "" + num3 + "" + num2);
            } else//2 1 3
            {
                System.out.println(num3 + "" + num1 + "" + num2);
            }

        }
    }
}
