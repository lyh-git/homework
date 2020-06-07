package day0605;

public class Dog extends Animal {
    public Dog() {
        System.out.println("我是Dog()");
    }

    @Override
    public void bark() {
//        super.bark();
        System.out.println("狗叫了");
    }
}

