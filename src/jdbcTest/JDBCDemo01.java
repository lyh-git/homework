package jdbcTest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo01 {


/**

 * JDBC的入门

  */
@Test
public void demo1() throws Exception{

// 1.加载驱动

        Class.forName("com.mysql.jdbc.Driver");

// 2.获得连接

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hua", "root", "root");

// 3.基本操作：执行SQL

// 3.1获得执行SQL语句的对象

        Statement statement= conn.createStatement();

// 3.2编写SQL语句:

//
        String sql="INSERT INTO (name,pwd) VALUES ('小明','123456')";
// 3.3执行SQL:

        ResultSet rs= statement.executeQuery(sql);

// 3.4遍历结果集:

        while(rs.next()){

        System.out.print(rs.getInt("id")+" ");

        System.out.print(rs.getString("name")+" ");

        System.out.print(rs.getString("pwd")+" ");


        System.out.println();

        }

// 4.释放资源

        rs.close();

        statement.close();

        conn.close();

        }

        }
