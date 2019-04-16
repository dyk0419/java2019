package zjitc.net.classwork.summary.user;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author admin
 * @Date 2019/4/16 15:47
 */
public class UserDaoSetHashMap implements UserDao {
    HashMap<String, User> hashMap = new HashMap<String, User>();

    @Override
    public void regist(User user) {
        Set<String> set = hashMap.keySet();
        boolean flag = set.contains(user.getUsername());
        if (flag) {
            System.out.println("注册失败，用户名重复了");
        } else {
            hashMap.put(user.getUsername(), user);
            System.out.println("注册成功");
        }
    }

    @Override
    public User login(String username, String password) {
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            String pword = hashMap.get(name).getPsaaword();
                if (name.equals(username) && pword.equals(password)) {
                    return hashMap.get(name);
                }
        }
        return null;
    }
}
