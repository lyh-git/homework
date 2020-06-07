package day0604.demo0604.demo02;

public class ManKind {
    int sex;
    int salary;

    public void manOrWorman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        } else {
            System.out.println("性别的值不正确");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else if (salary > 0) {
            System.out.println("have a job");
        } else {
            System.out.println("欠债");
        }
    }
    
    void method() {
        
    }
    
}
