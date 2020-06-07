package day0602;

/**
 * @author HUA
 */
public class Person {
    private Integer age;

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age>0&&age<130) {
            this.age = age;
        }else {
            System.out.println("年龄输入错误自动设置为20");
            this.age=20;
        }

    }
}
