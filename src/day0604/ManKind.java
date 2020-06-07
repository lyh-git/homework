package day0604;

/**
 * @author HUA
 */
public class ManKind {
    public int sex;
    public int salary;
    public void  manOrWoman(){
        if (sex==1){
            System.out.println("man");
        }else if (sex==0){
            System.out.println("woman");
        }
        else {
            System.out.println("未知性别");
        }
    }
    public void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else if (salary>0){
            System.out.println("job");
        }
        else {
            System.out.println("负债");
        }
    }


}
