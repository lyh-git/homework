package day0606.dome02;

import java.util.Arrays;

public class TestPerson {


    public static Person[] arr = new Person[3];
    static int count=0;

    public static void print() {
        for (Person person : arr) {
            System.out.println(person);
        }
    }


    public static void del(Person delPerson) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(delPerson)) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = null;
                count--;
                break;
            }
        }
    }

    public static void add(Person addPerson) {
        if (count >= arr.length) {
            //重新赋予数组长度
            int newLen = (arr.length * 2);
            arr = Arrays.copyOf(arr, newLen);
        }
        arr[count++] = addPerson;


    }

    public static void update(Person oldPerson, Person updatePerson) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(oldPerson)){
                arr[i]=updatePerson;
                break;
            }

        }

    }


    public static Person find(Person findPerson) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(findPerson)) {
                return arr[i];
            }
        }
        return null;

    }

    public static int hLength(Person[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
        return arr.length;
    }
}
