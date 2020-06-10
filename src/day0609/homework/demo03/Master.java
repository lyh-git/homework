package day0609.homework.demo03;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Master {
//    public void feed(Dog1 dog1){
//        dog1.eat();
//    }
//    public void feed(Penguin penguin){
//        penguin.eat();
//    }
//    public void feed(Cat cat){
//        cat.eat();
//    }
    public void feed(Pet pet){
        pet.eat();
    }
    public Pet getPet(String typeId){

        switch (typeId){
            case "1":
                System.out.println("领养成功");
                return new Dog1();
            case "2":
                System.out.println("领养成功");
                    return new Penguin();
            case "3":
                System.out.println("领养成功");
                return new Cat();
            default:
                System.out.println("输入错误，没有该类型宠物，领养失败");

                return null;
        }
    }
}
