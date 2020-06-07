package day0606.dome06;

public class GeomtricObject {
    protected String color;
    protected double weight;

    public GeomtricObject(String color) {
        this.color = color;
    }

    public GeomtricObject() {
    }

    public GeomtricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
}
