package day0602.demo0602;

public class Demo10 {

    public static void main(String[] args) {
        Student s = new Student();
        // 对象名.属性名
        // s.age = -1;// 学生年龄不能为-1 所以属性不能直接暴露
        s.setAge(-1);
        System.out.println(s.getAge());
    }

}
