package day03;

public class CalcDays {
    public static void main(String[] args) {


        int days = 46;
        int weeks = days/7;
        int lastDay = days%7;
        //46天是6周，剩余4天。
        System.out.println(days+"天是"+weeks+"周，剩余"+lastDay+"天。");

    }
}
