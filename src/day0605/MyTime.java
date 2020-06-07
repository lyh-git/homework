package day0605;

/**
 * @author HUA
 */
public class MyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(5,16,30);
        System.out.println(myTime.toString());
    }
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour+"小时"+minute+"分钟"+second+"秒";
    }
}
