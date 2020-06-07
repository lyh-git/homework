package day0603;

public class Phone {
    private String brand;
//    private Cell cell;
    public String downloadMusic(){
        return "好汉歌";
    }
    public void playMusic(){
        System.out.println("正在播放"+downloadMusic());
    }
    public void chargeCell(Cell cell){
        cell.setBrand("Anyone");
        cell.getPower();
    }
}
