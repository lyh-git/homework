package day0602.demo0602;

public class Student {
    private int age;
    private String name;
    private String stuNo;

    // 获取该对象的年龄值
    public int getAge() {
        return age;
    }

    // 给对象的属性值赋值
    public void setAge(int age) {
        // this指代的是调用该方法的当前对象
        if (age < 0 || age > 200) {
            System.out.println("年龄数值不合法,已设置为默认值15");
            this.age = 15;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    // // 当对象被创建的时候会被运行一次
    // {
    // System.out.println("一个Student对象被创建");
    // }
    //
    // // 静态代码块：当类被加载的时候 仅会被运行一次
    // static {
    // System.out.println("Student类型被加载一次");
    // }
}

class Demo {

}
