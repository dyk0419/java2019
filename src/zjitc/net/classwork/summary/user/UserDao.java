package zjitc.net.classwork.summary.user;

/**
 * @Author admin
 * @Date 2019/4/16 14:11
 */
public interface UserDao {
    void regist(User user);
    User login(String username,String password);
    void ergodic();
    int delete(String username,String password);
}
