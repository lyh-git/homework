package day0603;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        StudentsBiz biz = new StudentsBiz();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入学生姓名：");
            String name=scanner.next();
            biz.addName(name);


        }
        biz.showName();
    }
}
