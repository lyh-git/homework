package day0605;

public class TestFullTime {
    public static void main(String[] args) {
        FullTime fullTime = new FullTime(new MyTime(14,17,35),new MyDate(2007,10,2));
        System.out.println(fullTime.toString());
    }
}
