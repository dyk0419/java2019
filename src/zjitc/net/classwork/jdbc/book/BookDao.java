package zjitc.net.classwork.jdbc.book;

import java.util.ArrayList;

/**
 * @author 杜源康
 * @date 2019-04-28 21:16
 */
public interface BookDao {
    int existence(String name);
    int add(Book book);
    int update2(Book book);
    int delete(int id);
    ArrayList select();
    void close();

}
