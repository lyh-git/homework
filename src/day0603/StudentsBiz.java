package day0603;

public class StudentsBiz {
    public String [] names=new String[30];
    public  int i=0;
    public void showName(){
        System.out.println("本班学生列表:");
        for (String name : names) {
            if(name!=null) {
                System.out.println(name);
            }
        }
    }
    public void addName(String name) {
        if (names[i]==null) {
//            System.out.println(i);
            names[i++]=name;
        }

        }
    }

