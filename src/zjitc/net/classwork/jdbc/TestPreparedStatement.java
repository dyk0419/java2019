package zjitc.net.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/24 10:30
 */
public class TestPreparedStatement {
    public static void main(String[] args) {
        Scanner scannerString=new Scanner(System.in);
        Scanner scannerInt=new Scanner(System.in);
        /*用预编译的方式*/
        Connection conn=null;
        PreparedStatement pstem=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/dyk";
            String user="root";
            String password="123456";
            conn= DriverManager.getConnection(url,user,password);
            String sql="insert into user (name,age) value (?,?)";
            pstem=conn.prepareStatement(sql);
            System.out.println("请输入用户名");
            String name=scannerString.nextLine();
            System.out.println("请输入年龄");
            int age=scannerInt. nextInt();

            /*设置sql语句中需要传入的参数*/
            pstem.setString(1,name);
            pstem.setInt(2,age);
            int c=pstem.executeUpdate();
            System.out.println("影响了"+c+"行");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
