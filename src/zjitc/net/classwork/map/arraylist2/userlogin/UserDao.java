package zjitc.net.classwork.map.arraylist2.userlogin;

/**
 * @Author admin
 * @Date 2019/3/29 10:34
 */
public interface UserDao {
    void regist(User user);
    boolean login(String username, String password);
}
