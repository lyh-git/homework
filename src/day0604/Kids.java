package day0604;

public class Kids extends ManKind {
    public int yearsOld;

    //练习2
    @Override
    public void employeed() {
        // 练习3
        super.employeed();
        System.out.println("Kids should study and no job");
    }

    public static void main(String[] args) {
        Kids kids = new Kids();
        System.out.println(kids.sex);
        System.out.println(kids.salary);
        kids.manOrWoman();
        kids.employeed();




    }
}
