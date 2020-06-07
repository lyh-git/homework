package day0605;

public class Truck extends Vehicle {
    private float load;

    public Truck(float load) {
        this.load = load;
    }

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck(){
        System.out.println("商标："+super.getBrand()+",颜色："+super.getColor()+",载重："+this.load);
    }
}
