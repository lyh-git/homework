package day0604.demo0604.demo03;

public class Student extends Person {
    public String name;
    public String school;

    public String getInfo() { // 重写方法
        //如果子类和父类出现同名属性 可以使用this与super进行区分1
        return "Name: " + super.name + "\nage: " + age + "\nschool: " + school;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bob";
        s1.age = 20;
        s1.school = "school2";
        System.out.println(s1.getInfo()); // Name:Bob age:20 school:school2
    }
}
