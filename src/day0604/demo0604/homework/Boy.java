package day0604.demo0604.homework;

public class Boy {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Girl girl) {
        System.out.println("结婚啦，和" + girl);
    }

    public Boy() {

    }

    public Boy(String name) {
        this();
        this.name = name;
    }

    public Boy(int age, String name) {
        this(name);
        this.age = age;
    }

}
