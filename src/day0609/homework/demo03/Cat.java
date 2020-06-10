package day0609.homework.demo03;

public class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("猫咪吃饭");
        if(getHealth()>100){
            System.out.println("不需要喂食，多做运动");
        }else {
            setHealth(getHealth()+4);
            System.out.println("体力值+4");
        }
    }
}
