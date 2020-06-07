package day03;

public class Pay01 {
    public static void main(String[] args) {
        //T恤价格
        int shirtPrice = 245;
        //网球鞋价格
        int shoePrice = 570;
        //网球拍价格
        int padPrice = 320;
        //T恤件数
        int shirtNo = 2;
        //运动鞋数目
        int shoeNo = 1;
        //网球拍数目
        int padNo = 1;

        double discount = 0.8;
        double sum = ((shirtPrice * shirtNo) + (shoePrice * shoeNo) + (padPrice * padNo)) * discount;
        System.out.println("消费总金额:"+sum);
    }
}
