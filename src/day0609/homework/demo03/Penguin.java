package day0609.homework.demo03;

public class Penguin extends Pet{
    private  String sex;

    public Penguin() {
    }

    @Override
    public void eat() {
        System.out.println("Penguin吃饭");
        if(getHealth()>100){
            System.out.println("不需要喂食，多做运动");
        }else {
            setHealth(getHealth()+5);
            System.out.println("健康值+5");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
