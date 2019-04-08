package zjitc.net.homework.homework7.userlogin;

/**
 * @Author admin
 * @Date 2019/3/29 10:34
 */
public interface UserDao {
    void regist(User user);
    boolean login(String username, String password);
    int search(String username);
    void output(int n);
    void ergodic();
}
