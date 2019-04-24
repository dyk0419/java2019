package zjitc.net.classwork.jdbc;

import java.sql.*;

/**
 * @Author admin
 * @Date 2019/4/24 9:19
 */
public class TestSelect {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dyk";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String sql = "select * from user ";
            resultSet=statement.executeQuery(sql);

            /*结果集中若存在记录（一条一条往下取），则循环操作*/
            while (resultSet.next()){
                //通过列名获取指定字段的值，参数必须与表中的字段名对应
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String age=resultSet.getString("age");
                System.out.println("id:"+id+"| name:"+name+"| age:"+age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

