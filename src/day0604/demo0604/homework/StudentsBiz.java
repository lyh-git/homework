package day0604.demo0604.homework;

public class StudentsBiz {
    private String[] names = new String[30];
    private int index = 0;

    public void showNames() {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
    }

    public void addName(String name) {
        names[index++] = name;
    }

    public static void main(String[] args) {

    }
}
