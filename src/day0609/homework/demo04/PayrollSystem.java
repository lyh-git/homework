package day0609.homework.demo04;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        employees[0]=new SalariedEmployee("hua1",new MyDate(2020,6,20),5000.0);
        employees[1]=new SalariedEmployee("hua2",new MyDate(2020, 5,20),6000.0);
        employees[2]=new SalariedEmployee("hua2",new MyDate(2020, 4,20),6000.0);
        employees[3]=new HourlyEmployee("hua2",new MyDate(2020, 3,20),50.0,8.0);
        employees[4]=new HourlyEmployee("hua2",new MyDate(2020, 6,20),50.0,9.0);
        System.out.println("请输入生日月份:");
        Integer month = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
            if (month==employees[i].getBirthday().getMouth()){
                System.out.println("这个月你生日,工资加100");
                double money = employees[i].earnings() + 100;
                System.out.println("当前工资"+money);
            }

        }
        
        
    }
}
