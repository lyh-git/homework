package day0602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author HUA
 */
public class Sort {
    public static void main(String[] args) {
        int j = 1;
        int count=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 9999; i >=1000; i--) {
            int thou = i / 1000;
            int hund = i % 1000 / 100;
            int ten = i % 100 / 10;
            int unit = i % 10;
            if (thou + ten == hund + unit) {
                count+=1;
                if (j % 5 == 0) {
                    System.out.print(i + " ");
                    System.out.println();
                } else {
                    System.out.print(i + " ");
                }
                j++;

            }


        }
        System.out.println("个数"+count);
    }
}
