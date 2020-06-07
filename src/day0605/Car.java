package day0605;

public class Car extends Vehicle {
    private int seats;

    public Car(int seats) {
        this.seats = seats;
    }

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void showCar(){
        System.out.println("商标："+super.getBrand()+",颜色："+super.getColor()+",z座位："+this.seats);
    }
}
