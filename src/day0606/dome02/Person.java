package day0606.dome02;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object ob) {
        //自反性
        if (this == ob) {
            return true;
        }
        //instanceof比较判断是否是同一类或者子父类关系
        if (!(ob instanceof Person)) {
            return false;
        }
        //判断是同一类或者子父类关系，再将Object类型强转为Students
        Person ob1 = (Person) ob;
        if (this.age == ob1.age && this.name.equals(ob1.name)) {
            return true;
        } else {
            return false;
        }

    }
}
