package day0603.demo0603;

public class Demo03 {
    public static void main(String[] args) {
        Person p = new Person("小明", 10);
        Person p2 = new Person("小明", 10);
        p.equals(p2);
    }

    public Demo03() {

    }

    public Demo03(int a) {

        System.out.println(a);
    }
}
