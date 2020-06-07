package day05;

import java.io.IOException;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) throws IOException {
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            String c = sc.next();
            switch (c) {
                case "a":
                    System.out.println("A");
                    break;
                case "b":
                    System.out.println("B");
                    break;
                case "c":
                    System.out.println("C");
                    break;
                case "d":
                    System.out.println("D");
                    break;
                case "e":
                    System.out.println("E");
                    break;
                default:
                    System.out.println("other");
                    break;
            }
        }
    }
}
