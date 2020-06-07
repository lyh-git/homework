package day03;

public class Pay {
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

        System.out.println("***********消费单***********");
        System.out.println("购买物品\t\t单价\t\t个数\t\t金额");
        System.out.println("T  恤\t\t" + "￥" +shirtPrice + "\t\t" + shirtNo + "\t\t  " + (shirtPrice * shirtNo));
        System.out.println("网球鞋\t\t" + "￥" +shoePrice + "\t\t" + shoeNo + "\t\t  " + (shoePrice * shoeNo));
        System.out.println("网球拍\t\t" + "￥" + padPrice + "\t\t" + padNo + "\t\t  " + (padPrice * padNo));
        System.out.println("\n折扣\t8折");
        double sum = ((shirtPrice * shirtNo) + (shoePrice * shoeNo) + (padPrice * padNo)) * discount;
        System.out.println("消费总金额:￥" + sum);
        System.out.print("实际交费:");
        double pay = 1500;
        System.out.println("找钱:￥" + (pay - sum));
        System.out.println("本次购物积分:" + (int) sum / 33);
    }
}
