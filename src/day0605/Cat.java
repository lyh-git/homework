package day0605;

public class Cat extends Animal{
    public Cat() {
        System.out.println("我是Cat()");
    }

    @Override
    public void bark() {
        System.out.println("猫叫");
    }
}
