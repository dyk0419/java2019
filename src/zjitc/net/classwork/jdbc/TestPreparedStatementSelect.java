package zjitc.net.classwork.jdbc;

import java.sql.*;

/**
 * @Author admin
 * @Date 2019/4/24 11:08
 */
public class TestPreparedStatementSelect {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstem = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/world";
            String username = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, username, password);
            String sql = "select ID,NAME,CountryCode from city ";
            pstem = conn.prepareStatement(sql);
            resultSet = pstem.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String countryCode = resultSet.getString("CountryCode");
                System.out.println("id:" + id + "| name:" + name + "| countryCode:" + countryCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
}
