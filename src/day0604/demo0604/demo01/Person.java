package day0604.demo0604.demo01;

import java.util.Date;

public class Person {
    public String name;
    public int age;
    public Date birthDate;

    public String getInfo() {
        return "Student [name=" + name + ", age=" + age + ", birthDate=" + birthDate + "]";
    }

    public Person(String name, int age, Date birthDate) {
        super();
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

}
