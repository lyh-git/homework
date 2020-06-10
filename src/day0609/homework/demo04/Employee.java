package day0609.homework.demo04;

public abstract class Employee {
    private String name;
    private  Integer number;
    private MyDate birthday;
    private static Integer total=0;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        total++;
        this.number=total;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract Double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", myDate=" + birthday +
                '}';
    }
}
