package DAY04;

import java.util.Scanner;

public class Spouse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("身高");
         int heigh=scanner.nextInt();
        System.out.println("财富");
        double money=scanner.nextDouble();
        System.out.println("帅否（true/false）");
        boolean b=scanner.nextBoolean();


        if (heigh > 180 && money > 1000 && b == true) {
            System.out.println("我一定要嫁给他!!!");
        } else if (heigh > 180 || money > 1000 || b) {
            System.out.println("嫁吧，比上不足，比下有余");
        } else {
            System.out.println("不嫁！");

        }
    }
}
