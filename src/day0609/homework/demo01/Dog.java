package day0609.homework.demo01;

public class Dog extends Animal {
    public Dog() {
        System.out.println("我是Dog()");
    }

    @Override
    public void bark() {
//        在调用Dog中的bark方法的同时，也同时执行Animal中的bark方法
        super.bark();
        System.out.println("狗叫了");
    }
}

