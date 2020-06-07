package day0606.dome01;

public class TestShape {
    public static void main(String[] args) {
        Shape [] shapes=new Shape[3];
        shapes[0]=new Circle(5);
        shapes[1]=new Triangle(5,6,7);
        shapes[2]=new Rectangle(5,8);
        Shape shape1= new Triangle(5,6,7);
        Shape s1=new Triangle(5,6,7);
        Triangle s = (Triangle) s1;
        s.draw("黑");


        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());

        }
    }
}
