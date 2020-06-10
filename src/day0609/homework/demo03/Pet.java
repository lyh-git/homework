package day0609.homework.demo03;
public abstract class Pet {
    private String name;
    private  int health;
    private  int love;

    public Pet() {
    }
    public abstract void eat();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void print(){
        System.out.println("宠物信息");
    }

}
