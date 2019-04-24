package zjitc.net.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/24 8:20
 */
public class TestInsert {
    public static void main(String[] args) {
        try {
            /*注册驱动*/
            Class.forName("com.mysql.jdbc.Driver");

            /*获得数据库连接
            * localhost指的是本机，要使用远程的服务器用IP
            * 3306是mysql的端口号，dyk是数据库名*/
            String url="jdbc:mysql://localhost:3306/dyk";
            String user="root";
            String password="123456";
            Connection connection=DriverManager.getConnection(url,user,password);


            /*获取Statement对象，它可以用来执行sql语句*/
            Statement statement=connection.createStatement();

            /* Scanner scanner=new Scanner(System.in);
           System.out.println("请输入用户名");
            String name=scanner.nextLine();
            System.out.println("请输入密码");
            String pword=scanner.nextLine();
            String sql="insert into user(name,age) value(     '"+name+"'     ,       '"+pword+"'             )";*/
            /*执行sql语句*/
            String sql="insert into user(name,age) value('lisi',19)";
            int c=statement.executeUpdate(sql);
            System.out.println("影响了"+c+"行");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
