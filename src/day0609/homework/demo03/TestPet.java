package day0609.homework.demo03;

import java.util.Scanner;

public class TestPet {
    public static void main(String[] args) {
//        Penguin penguin = new Penguin();
//        Dog1 dog1 = new Dog1();
//        Pet p=new Cat();
        Master master = new Master();
//        master.feed(penguin);
//        master.feed(p);

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要领养的宠物类型：（1、狗狗 2、企鹅）");
        String num=sc.next();
        master.getPet(num).eat();
    }
}