package day0606.dome05;

public class SupeAudiCar  extends AudiCar{
    @Override
    public void run() {
        System.out.println("高端的奥迪车跑");
    }
    public void automaticParking(){
        System.out.println("自动泊车");
    }
    public void unmanned(){
        System.out.println("无人驾驶");
    }
}
