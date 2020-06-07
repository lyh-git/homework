package day0605;

public class TestAnimal {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.setLove(80);
        dog1.setHealth(90);
        dog1.eat();
        dog1.print();
        dog1.play();
        dog1.print();
    }
}
