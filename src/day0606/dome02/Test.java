package day0606.dome02;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person("1");
        Person person2 = new Person("2");
        Person person3 = new Person("3");
        Person person4 = new Person("4");

        System.out.println("添加");
        TestPerson.add(person1);
        TestPerson.add(person2);
        TestPerson.add(person3);
        TestPerson.add(person4);
        TestPerson.print();
        System.out.println("查找");
        System.out.println(TestPerson.find(person2));
        System.out.println("删除");
        TestPerson.del(person4);
        TestPerson.print();
        System.out.println("更新");
        TestPerson.update(person3,person4);
        TestPerson.print();


    }



}
