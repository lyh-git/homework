package day07;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int [] array1;
        int [] array2;
        array1=new int[]{2,3,5,7,11,13,17,19};
//        System.out.println(Arrays.toString(array1));
//        array2=array1;
//        array2[0]=0;
//        array2[2]=2;
        System.out.println(Arrays.toString(array1));
        array2=Arrays.copyOf(array1, array1.length);
        array2[0]=0;
        array2[2]=2;

    }
}
