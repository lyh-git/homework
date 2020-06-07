package day0603.demo0603.homework;

public class Person {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // if else else if 分支选择结构
        if (age > 130 || age < 0) {
            System.out.println("输入的年龄不合法,已经设置为默认年龄0");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Person() {
        this.age = 18;
        this.name = "初始姓名";
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

}
