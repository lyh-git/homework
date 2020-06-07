package day0605;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caculator ca = new Caculator();
        while (true) {
            System.out.println("输入两个数(自然数或者小数)，再输入一个加、减、乘、除的符号");
            int a = sc.nextInt();
            int b = sc.nextInt();
            String m = sc.next();
            switch (m){
                case "*":
                    System.out.println(ca.multiplication(  a,b));
                    break;
                case "-":
                    System.out.println(ca.subtraction ( a,b));
                    break;
                case "+":
                    System.out.println(ca.addition( a,b));
                    break;
                case "/":
                    System.out.println(ca.division( a,b));
                    break;

                default:
                    System.out.println("输入有误");
            }
            System.out.println("是否继续计算(y/n)");
            String command=sc.next();
            if (command.equals("n")) {
                System.out.println("结束");
                break;
            }

            }


        }
        public  double multiplication(double a, double b){
            return a * b;
        }
        public double addition ( double a, double b)
        {
            return a + b;
        }
        public double division ( double a, double b)
        {
            return a / b;
        }
        public double subtraction ( double a, double b)
        {
            return a - b;
        }
    }
