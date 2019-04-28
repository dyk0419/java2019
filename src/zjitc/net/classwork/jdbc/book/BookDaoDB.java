package zjitc.net.classwork.jdbc.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @Author admin
 * @Date 2019/4/26 8:16
 */
public class BookDaoDB implements BookDao {
    Connection conn = JDBCUtils.getConn();
    PreparedStatement pstem = null;
    ResultSet resultSet = null;

    /**
     * 这种判断图书重复的方法，返回的是图书的id
     * @param name
     * @return
     */
    @Override
    public int existence(String name) {
        int id = -1;
        String sql = "SELECT`bookid`\n" +
                "FROM`book`\n" +
                "WHERE`bookname`=?";
        try {
            pstem = conn.prepareStatement(sql);
            pstem.setString(1, name);
            resultSet = pstem.executeQuery();
            while (resultSet.next()){
                id=resultSet.getInt("bookid");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    private Book query(String name){
        String sql="select * from where bookname=?";
        try {
            pstem=conn.prepareStatement(sql);
            pstem.setString(1,name);
            resultSet=pstem.executeQuery();
            /*因为图书名不能重复，所以结果集中只有一条语句，所以用if？*/
            if (resultSet.next()){
                int id = resultSet.getInt("bookid");
                String bookname = resultSet.getString("bookname");
                String press = resultSet.getString("press");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");
                Book book = new Book(id, bookname, press, author, price);
                return book;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }

    @Override
    public int add(Book book) {
        int c = 0;

/*          Book book1=query(book.getBookname());
          if (book1==null){
                可以添加
          }*/

        int id = existence(book.getBookname());
        if (id == -1) {
            try {
                String sql = "insert into book(bookname,press,author,price) value (?,?,?,?)";
                pstem = conn.prepareStatement(sql);
                pstem.setString(1, book.getBookname());
                pstem.setString(2, book.getPress());
                pstem.setString(3, book.getAuthor());
                pstem.setDouble(4, book.getPrice());
                c = pstem.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("图书重复了");
        }
        return c;
    }

    public int update(String project, String content, int bookid) {
        int c = 0;
        String sql = "UPDATE `book` \n" +
                "SET bookname=?\n" +
                "WHERE `bookid`=?";
        try {
            pstem = conn.prepareStatement(sql);
            /*   pstem.setString(1, project);*/
            pstem.setString(1, content);
            pstem.setInt(2, bookid);
            c = pstem.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    /**
     * 这种方法是替换整条图书信息
     * @return
     */
    @Override
    public int update2(Book book){
        int c=0;
        int id = existence(book.getBookname());
        if (id!=-1){
            String sql="UPDATE`book`\n" +
                    "SET `bookname`=?,press=?,`author`=?,`price`=?\n" +
                    "WHERE`bookid`=?";
            try {
                pstem=conn.prepareStatement(sql);
                pstem.setString(1, book.getBookname());
                pstem.setString(2, book.getPress());
                pstem.setString(3, book.getAuthor());
                pstem.setDouble(4, book.getPrice());
                pstem.setInt(5,id);
                c=pstem.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    public int update(String project, double price, int bookid) {
        int c = 0;
        String sql = "UPDATE`book`\n" +
                "SET?=?\n" +
                "WHERE`bookid`=?";
        try {
            pstem = conn.prepareStatement(sql);
            pstem.setString(1, project);
            pstem.setDouble(2, price);
            pstem.setInt(3, bookid);
            c = pstem.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public int delete(int id) {
        int c = 0;
        String sql = "delete from book where bookid=?";
        try {
            pstem = conn.prepareStatement(sql);
            pstem.setInt(1, id);
            c = pstem.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public ArrayList select() {
        ArrayList<Book> arrayList = new ArrayList<Book>();

        String sql = "select * from book";
        try {
            pstem = conn.prepareStatement(sql);
            resultSet = pstem.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("bookid");
                String name = resultSet.getString("bookname");
                String press = resultSet.getString("press");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");
                Book book = new Book(id, name, press, author, price);
                arrayList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    @Override
    public void close(){
        JDBCUtils.close(conn,pstem,resultSet);
    }
}
