package day06;

import java.util.Scanner;

public class StaStudent {
    private int score;
    private String grade;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public StaStudent(int score, String grade) {
        this.score = score;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StaStudent{" +
                "score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num = scanner.nextInt();
        System.out.println("请输入" + num + "个成绩");
        int[] scoreArr = new int[num];
        int max = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = scanner.nextInt();
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        System.out.println("最高分是："+max);
        StaStudent[] staStudents = new StaStudent[num];
        String grade1 = "";
        for (int i = 0; i < staStudents.length; i++) {
            if (scoreArr[i] >= max - 10) {
                grade1 = "A";
            } else if (scoreArr[i] >= max - 20) {
                grade1 = "B";
            } else if (scoreArr[i] >= max - 30) {
                grade1 = "C";
            } else {
                grade1 = "D";
            }
            staStudents[i] = new StaStudent(scoreArr[i], grade1);
        }
        for (StaStudent staStudent : staStudents) {
            System.out.println(staStudent);

        }

    }
}
