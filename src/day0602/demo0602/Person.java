package day0602.demo0602;

public class Person {
    int age;// 成员属性 有默认值 不需要手动初始化
    String name;

    // 没有声明返回值类型
    // 构造函数方法名 == 类名
    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    public void show() {
        // int i;// 局部变量 声明 必须手动初始化
        // i = 1;
        // i = i + 1;
        // Student s = null;
        // Student s2 = new Student();
        // s.equals(s2);// 有可能出现空指针异常
        System.out.println("我今年" + age + "岁，名字叫" + name);
        return;
    }
}
