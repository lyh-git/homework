package jdbcTest;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBUtil {

    private static Connection conn = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    private static final CallableStatement cs = null;

    /**
     * Insert方法封装
     * @param stu 传入参数
     */
    public static void Insert(StuInfo stu) {
        //调用 DBconnection 类的 conn() 方法连接数据库
        conn = DBConn.conn();
        //插入sql语句
        String sql = "INSERT INTO stuinfo (sno,sname,dname,ssex,cno,mark,type) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);

            /**
             * 调用实体StuInfo类,获取需要插入的各个字段的值
             * 注意参数占位的位置
             * 通过set方法设置参数的位置
             * 通过get方法取参数的值
             */
            ps.setString(1, stu.getSno());
            ps.setString(2, stu.getSname());
            ps.setString(3, stu.getDname());
            ps.setString(4, stu.getSsex());
            ps.setInt(5, stu.getCno());
            ps.setDouble(6, stu.getMark());
            ps.setString(7, stu.getType());

            ps.executeUpdate();			//执行sql语句

            System.out.println("插入成功(*￣︶￣)");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConn.close();
        }
    }

    /**
     * Insert方法封装
     * @param stu 传入参数
     */
    public static StuInfo select() {
        //调用 DBconnection 类的 conn() 方法连接数据库
        conn = DBConn.conn();
        //插入sql语句
        String sql = "select * from stuinfo";
        try {
            Statement statement= conn.createStatement();
            ResultSet rs= statement.executeQuery(sql);

            System.out.println("查询成功(*￣︶￣)");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConn.close();
        }
    }

}