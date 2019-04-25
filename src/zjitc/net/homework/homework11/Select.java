package zjitc.net.homework.homework11;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-24 23:28
 * 使用Java代码操作book表：将键盘输入的内容添加到book表，
 * 修改book表中的数据，删除数据，并且将book表中的所有记录
 * 查询出来保存在集合中，最后遍历集合，输出所有内容。
 */
public class Select {
    public static void main(String[] args) {
        ArrayList<Book>arrayList=new ArrayList<Book>();
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstem = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookjava";
            String user = "root";
            String password = "419419";
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from book";
            pstem = conn.prepareStatement(sql);
            resultSet = pstem.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("bookid");
                String name = resultSet.getString("bookname");
                String press = resultSet.getString("press");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");
                Book book = new Book(id, name, press, author, price);
                arrayList.add(book);
            }

            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
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
