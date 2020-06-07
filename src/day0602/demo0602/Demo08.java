package day0602.demo0602;

public class Demo08 {
    public static void test(String[] msg) {
        System.out.println("含字符串数组参数的test方法 ");
    }

    public static void test1(String book) {
        System.out.println("****与可变形参方法构成重载的test1方法****");
    }

    // 可传入0-n个不同的参数
    public static void test1(String... books) {
        System.out.println("****形参长度可变的test1方法****");
    }

    public static void main(String[] args) {
        // 下面两次调用将执行第二个test方法
        test1();
        test1("aa", "bb", "cc", "dd", "ee", "ff");
        // 下面将执行第一个test方法
        test(new String[] { "aa", "bb" });
    }

}
