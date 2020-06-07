package day06;

public class Array1 {
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
        for (int i = 0; i < d.t.length; i++) {
            System.out.println(d.t[i]);
            d.t[i]=true;
        }
        for (boolean b : d.t) {
            System.out.println(b);
        }


    }

}
class Pritimive{
    boolean [] t=new boolean[3];
}
