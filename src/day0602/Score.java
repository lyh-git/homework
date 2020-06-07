package day0602;

public class Score {
//    1.编写名为: Score 类，用于描述成绩；
//    2.有三门成绩：语文，外语，数学；
//    3.要求三门成绩有相应的set和get方法；set用于赋值；get用于获取值；
//     [ 例如有变量 int abc;
//    对应的set方法为: void setAbc(int abc){this.abc=abc;}
//    对应的get方法为: int getAbc(){return this.abc};
//]
//    完成后编译

    private double chinese;
    private  double english;
    private  double mathematics;

    public Score() {
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMathematics() {
        return mathematics;
    }

    public void setMathematics(double mathematics) {
        this.mathematics = mathematics;
    }
}
