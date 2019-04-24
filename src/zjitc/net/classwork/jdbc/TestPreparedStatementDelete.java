package zjitc.net.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/24 10:47
 */
public class TestPreparedStatementDelete {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Connection conn=null;
        PreparedStatement pstem=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/dyk";
            String username="root";
            String password="123456";
            conn= DriverManager.getConnection(url,username,password);
            String sql="delete from user where name=?";
            pstem=conn.prepareStatement(sql);
            System.out.println("请输入用户名");
            String name=scanner.nextLine();
            pstem.setString(1,name);
            int c=pstem.executeUpdate();
            System.out.println("影响了"+c+"行");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
