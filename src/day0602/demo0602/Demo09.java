package day0602.demo0602;

public class Demo09 {

    public static void main(String[] args) {
        int a = 1;
        // 把a变量中存的值 直接传给add方法
        add(a);
        System.out.println("a = " + a);
        // p存的就是堆内存中Person对象的地址/引用
        Person p = new Person(15, "小明");
        // 把p变量中存的值 直接传给changeAge方法
        changeAge(p);
        System.out.println(p.age);
    }

    public static void add(int a) {
        a += 4;
    }

    public static void changeAge(Person person) {
        person.age = person.age + 5;
    }
}
