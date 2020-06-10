package day0609.demo01;

public class Hungry {
    private static final Person person=new Person();

    private Hungry() {
    }
    private static  Person getPerson(){
        return person;
    }
}
