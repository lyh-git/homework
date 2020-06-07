package day0605;

public class Dog1 extends Pet {
    private String strain;

    public Dog1() {
        if (super.getLove()<0&&super.getLove()>100) {
            super.setLove(0);
        }
        if (super.getHealth()<0&&super.getHealth()>100) {
            super.setLove(60);
        }
    }

    public String getStrain() {
        return strain;

    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    public void eat(){
        System.out.println("狗狗吃饭");
        if(getHealth()>100){
            System.out.println("多做运动");
        }else {
            setHealth(getHealth()+3);
        }
    }
    public  void play(){
        System.out.println("狗狗吃饭");
        if(getHealth()<60){
            System.out.println("狗狗生病了");
        }else {
            setHealth(getHealth()-10);
            setLove(getLove()+5);
        }
    }

    @Override
    public void print() {
        System.out.println("健康值"+getHealth()+"，亲密度"+getLove());
    }
}
