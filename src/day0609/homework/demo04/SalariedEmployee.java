package day0609.homework.demo04;

public class SalariedEmployee extends Employee {
    private Double monthlySalary = 5000.0;
    private static String type = "Salaried";

    public SalariedEmployee(String name, MyDate birthday, Double monthlySalary) {
        super(name, birthday);
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        SalariedEmployee.type = type;
    }

    @Override
    public Double earnings() {

        return this.monthlySalary;


    }

    @Override
    public String toString() {
        return " " + super.toString() + ",类型" + SalariedEmployee.type + ",工资:" + earnings();
    }
}
