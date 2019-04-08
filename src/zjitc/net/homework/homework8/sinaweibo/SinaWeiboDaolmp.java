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
        boolean flag = true;
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
//            if (user.getUsername() = iterator.next().)
        }
        hashSet.add(user);

        if (user.getPsaaword() != user.getPasswordenter()) {
            System.out.println("密码输入有误，请重新注册");
        } else {
            String num = user.getPhonenumber().substring(0, 2);
            if (user.getPhonenumber().length() != 11 & num != "13" & num != "15" & num != "17" & num != "18") {
                System.out.println("手机号输入有误");
            } else {
                if (user.getEmail().contains("@")) {
                    System.out.println("注册成功！");
                }
            }
        }
    }

}
