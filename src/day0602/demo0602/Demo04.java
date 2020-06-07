package day0602.demo0602;

public class Demo04 {

    public static void main(String[] args) {
        sell(0);
        Calculator c = new Calculator();
        int a = 1;
        Integer i = 1;
        c.method(i);
    }

    public static void sell(int money) {
        System.out.println("卖东西了，看你有多少钱 我给你挑一个");
        if (money <= 0) {
            System.out.println("没有钱 不卖！");
            return;// 提前结束整个方法
        }

        if (money < 50 && money > 0) {
            System.out.println("一件衣服");
        }

        if (money < 100 && money > 50) {
            System.out.println("一条裤子");
        }
    }

}
