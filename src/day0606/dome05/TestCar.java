package day0606.dome05;

public class TestCar {
    public static void main(String[] args) {
        SupeAudiCar supeAudiCar = new SupeAudiCar();
        supeAudiCar.run();
        supeAudiCar.automaticParking();
        supeAudiCar.unmanned();
        AudiCar audiCar = new AudiCar();
        audiCar.run();
    }
}
