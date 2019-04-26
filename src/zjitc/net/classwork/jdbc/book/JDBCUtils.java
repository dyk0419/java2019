package zjitc.net.classwork.jdbc.book;

import java.sql.*;

/**
 * @Author admin
 * @Date 2019/4/26 8:14
 * jdbc操作的工具类
 * 抽取增删改查的一些重复代码：1.获取数据库连接  2.关闭流
 */
public class JDBCUtils {
    private static Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookjava";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回数据库连接对象
     *
     * @return
     */
    public static Connection getConn() {
        return conn;
    }

    public static void close(Connection conn, PreparedStatement pstem) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (pstem != null) {
                pstem.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void close(Connection conn, PreparedStatement pstem, ResultSet resultSet) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (pstem != null) {
                pstem.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
