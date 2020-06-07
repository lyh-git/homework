package day0604.demo0604.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws Exception {

        // 如何创建指定日期对象
        // 创建SimpleDateFormat对象 并且传入格式化字符串 要求后续传入的表示日期的字符串的格式
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日hh小时mm分ss秒");
        // 表示日期的字符串
        String str = "2011年11月11日14小时58分09秒";
        // 把字符串转换为Date对象
        Date d = s.parse(str);
        Person p = new Person("小明", 10, d);
        System.out.println(p.getInfo());
    }
}
