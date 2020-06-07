package day0603.demo0603.homework;

public class TestPerson {

    public static void main(String[] args) {
        Person b = new Person();
        // b.setAge(100);
        // System.out.println(b.getAge());
        Person p = new Person(15, "小明");
        System.out.println(p.toString());
    }

}
