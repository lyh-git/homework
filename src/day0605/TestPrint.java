package day0605;

public class TestPrint {
    public static void main(String[] args) {
        Printer d=new DotMatrixPrint();
        Printer i=new InkpetPrinter();
        Printer l=new LaserPrinter();

        d.print();
        i.print();
        l.print();
    }
}
