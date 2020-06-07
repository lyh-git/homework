package day0606.dome08;

import java.util.Scanner;
import java.util.Vector;

public class WorkVector {
    public static void main(String[] args) {
        Vector c=new Vector();
        int n=0;
        int max=0;
        System.out.println("请输入学生成绩：");
        System.out.println("提示：若输出为负数则录入结束");
        while(n>=0){
            Scanner input=new Scanner(System.in);
            n=input.nextInt();
            if(n>=0&&n<=100) {
                c.addElement(n);
            }
        }
        System.out.println(c.size());
        for(int i=0;i<c.size();i++) {
            if(((int)c.elementAt(i))>max) {
                max=(int)c.elementAt(i);
            }
            System.out.println(c.elementAt(i));
        }
        System.out.println("最高分为："+max);
        for(int i=0;i<c.size();i++) {
            if(max-((int)c.elementAt(i))<=10) {
                System.out.println(c.elementAt(i)+"\tA等");
            }else if(max-((int)c.elementAt(i))<=20) {
                System.out.println(c.elementAt(i)+"\tB等");
            }else if(max-((int)c.elementAt(i))<=30) {
                System.out.println(c.elementAt(i)+"\tC等");
            }else {
                System.out.println(c.elementAt(i)+"\tD等");
            }
        }
    }
}

