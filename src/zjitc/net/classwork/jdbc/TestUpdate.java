package zjitc.net.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author admin
 * @Date 2019/4/24 9:05
 */
public class TestUpdate {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            /*1.注册驱动
             * 2.获得数据库连接
             * 3.获得能操作的sql语句的对象
             * 执行sql语句*/
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dyk";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String sql = "UPDATE `user`\n" +
                    "SET`age`=25\n" +
                    "WHERE`name`='lisi'";

            int c = statement.executeUpdate(sql);
            System.out.println("影响了" + c + "行");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement!=null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
