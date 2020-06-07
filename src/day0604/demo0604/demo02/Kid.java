package day0604.demo0604.demo02;

public class Kid extends ManKind {
    int yearsOld;

    @Override
    public void method() {
        // 继承了父类的void method()方法 并且权限范围比父类更广
    }

    public void printAge() {
        System.out.println("年龄：" + yearsOld);
    }

    public String toString() {
        return "Kid [yearsOld=" + yearsOld + "]";
    }

    public static void main(String[] args) {
        Kid k = new Kid();
        System.out.println(k.yearsOld);
        k.employeed();
        k.manOrWorman();
    }
}
