package day05;

public class Flowers {
    public static void main(String[] args) {
        int num, x, y, z;
        for (num = 100; num < 10000; num++) {
            x = num % 10;//求余，留下个位数字赋值给x
            y = (num - x) / 10 % 10;//减去个位数，留下十位数和百位数，除以10，再求余，留下十位数字赋值给y
            z = num / 100;//除以100，留下百位数字赋值给z
            if (num == x * x * x + y * y * y + z * z * z) {
                System.out.println(num);//判断此数是否为水仙花数，若是则输出此数
            }
        }
    }
}
