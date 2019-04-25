package zjitc.net.homework.homework11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-24 23:28
 * 使用Java代码操作book表：将键盘输入的内容添加到book表，
 * 修改book表中的数据，删除数据，并且将book表中的所有记录
 * 查询出来保存在集合中，最后遍历集合，输出所有内容。
 */
public class Update {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstem = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookjava";
            String user = "root";
            String password = "419419";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("请选择你要修改的内容");
            System.out.println("1.图书名称");
            System.out.println("2.出版社");
            System.out.println("3.作者");
            System.out.println("4.价格");
            int n=scannerInt.nextInt();
            if (n==1){
                String sql = "insert into book(bookname,press,author,price) value (?,?,?,?)";
                pstem = conn.prepareStatement(sql);
            }




            System.out.println("请输入图书名称");
            String bookname = scannerString.nextLine();
            System.out.println("请输入出版社");
            String press = scannerString.nextLine();
            System.out.println("请输入作者");
            String author = scannerString.nextLine();
            System.out.println("请输入价格");
            double price = scannerDouble.nextDouble();


            pstem.setString(1, bookname);
            pstem.setString(2, press);
            pstem.setString(3, author);
            pstem.setDouble(4, price);
            int c = pstem.executeUpdate();
            System.out.println("影响了" + c + "行");
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
