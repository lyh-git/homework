package day0604.demo0604.demo03;

class Parent {
    private void method1() {
    }
}

class Child extends Parent {
    void method1() {
    }
    // 非法，子类中的method1()的访问权限private比被覆盖方法的访问权限public弱
}

public class UseBoth {
    
    
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child p2 = new Child();
        // Parent p3 = new Child();// 多态
        // p1.method1();
        p2.method1();
    }
}
