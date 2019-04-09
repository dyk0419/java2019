package zjitc.net.homework.homework8.sinaweibo;


import sun.security.util.Length;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 杜源康
 * @date 2019-04-09 00:24
 */
public class SinaWeiboDaolmp {
    HashSet<User> hashSet = new HashSet<User>();

    public void regist(User user) {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            User u = (User) iterator.next();
            if (u.getUsername().equals(user.getUsername())) {
                System.out.println("注册失败！用户重复");
                return;
            }
        }
        hashSet.add(user);
        System.out.println("注册成功");
    }
}
