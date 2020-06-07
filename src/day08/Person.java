package day08;

public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.study();
        person.addAge(2);
        person.showAge();
        Person person1 = new Person();
        person1.study();
        person1.addAge(2);
        person1.showAge();

    }
    private String name;
    private int age;
    private int sex;

    public Person() {
    }

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void study() {
        System.out.println("studing");
    }

    public void showAge() {
        System.out.println(getAge());
    }

    public int addAge(int i) {
        return this.age += i;
    }
}
