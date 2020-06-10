package day0609.demo01;

import org.junit.Test;

public class Person {
    private  int id;
    private  static  int total=0;
    public  static  void setTotalPerson(int total){
        Person.total =total;
    }

    public int getId() {
        return id;

    }

    public static int getTotal() {
        return total;
    }

    public Person() {
        total++;
        id=total;
    }
    @Test
    public void test1(){
        Person.setTotalPerson(3);
        Person.getTotal();

    }
}

