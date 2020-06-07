package day0603;

public class Cell {
    private String brand;

    public Cell() {
    }

    public Cell(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void getPower(){
        System.out.println(this.brand+"电池正在充电");
    }
}
