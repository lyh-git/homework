package day0605;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("保时捷", "红色");
        vehicle.showInfo();
        vehicle.run();
        Car car = new Car("玛莎拉蒂", "白色", 2);
        car.showCar();
        car.run();
        Truck truck = new Truck("奔驰", "黑色", 100);
        truck.showTruck();
        truck.run();

    }
}
