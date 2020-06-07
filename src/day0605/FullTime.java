package day0605;

public class FullTime {

    private MyTime myTime;
    private MyDate myDate;

    public FullTime() {

    }

    public FullTime(MyTime myTime, MyDate myDate) {
        this.myTime = myTime;
        this.myDate = myDate;
    }

    public MyTime getMyTime() {
        return myTime;
    }

    public void setMyTime(MyTime myTime) {
        this.myTime = myTime;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return myDate.toString()+myTime.toString();
    }
}
