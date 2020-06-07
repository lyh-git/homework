package day03;

public class Area {
    public static void main(String[] args) {

        System.out.println("请输入所计算的圆的半径：");
        double r = 1.5;
        //Math.PI比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值。
        double area = Math.PI*r*r;
        System.out.println("该圆的面积为："+area);

    }
}
