package day0609.homework.demo04;

public class HourlyEmployee extends Employee{
    private static String type="hour";
    private Double wage=50.0;
    private Double hour;

    public HourlyEmployee(String name, MyDate birthday, Double wage, Double hour) {
        super(name, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public Double earnings() {

        return this.hour*this.wage;
    }
    @Override
    public String toString() {
        return " " + super.toString() + ",类型：" + HourlyEmployee.type+",工资：" +earnings();
}
}
