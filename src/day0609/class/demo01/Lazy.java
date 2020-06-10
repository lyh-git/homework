package day0609.demo01;

public class Lazy {
    private static Person p=null;

    private Lazy() {

    }

    private static Person getPerson() {
//        return new Person();
        if (p == null) {
           p=new Person();
        }
        return p;
    }
}
