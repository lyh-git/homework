package jdbcTest;



public class RunMain {

    public static void main(String[] args) {
        StuInfo stu = new StuInfo("9006", "波波菜", "计算机科学与软件工程", "女", 8, 99.5, "必修");
        DBUtil.Insert(stu);
        DBUtil.select();
    }
}