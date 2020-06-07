package day0605;

public class Vehicle {
    private String brand;
    private String color;

    public Vehicle() {

    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run(){
        System.out.println("我已经开动了");
    }

    public void showInfo(){
        System.out.println("商标："+this.brand+",颜色："+this.color);
    }
}
