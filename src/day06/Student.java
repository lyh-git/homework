package day06;

import java.util.Random;

public class Student {
    private int number;
    private int state;
    private int score;
    public Student(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
    public static void main(String[] args) {

        Random random = new Random();
        Student[] s = new Student[20];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student(i + 1, random.nextInt(10), random.nextInt(100));


        }
        for (int i = 0; i < s.length; i++) {

            if (s[i].state == 3) {
                System.out.println(s[i]);
            }
        }
    }

}
