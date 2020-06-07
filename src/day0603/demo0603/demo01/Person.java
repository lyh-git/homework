package day0603.demo0603.demo01;

public class Person {
    private String name;
    private int age;
    private String school;
    private String major;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String school) {
        this(name, age);
        this.school = school;
    }

    public Person(String name, int age, String school, String major) {
        this(name, age, school);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", school=" + school + ", major=" + major + "]";
    }

}
