package zjitc.net.homework.homework7.userlogin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/29 10:43
 */
public class UserDaolmp implements UserDao {
    Scanner scanner = new Scanner(System.in);
    ArrayList userList = new ArrayList();
    ArrayList passwordList = new ArrayList();
    ArrayList emailList = new ArrayList();

    @Override
    public void regist(User user) {
        userList.add(user.getUserName());
        passwordList.add(user.getPassword());
        emailList.add(user.getEmail());
        System.out.println("注册成功！");
    }

    @Override
    public boolean login(String userName, String password) {
        for (int i = 0; i < userList.size(); i++) {
            /* String User= (String) userList.get(i);*/
            if (userName.equals(userList.get(i))) {
                /* String pass= (String) passwordList.get(i);*/
                if (password.equals(passwordList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int search(String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (username.equals(userList.get(i))) {
                return i;
//                System.out.println("用户名：" + userList.get(i) + "\t" + "密码：" + passwordList.get(i) + "\t" + "邮箱：" + emailList.get(i));
            }
//            System.out.println("不存在该用户");
        }
        return -1;
    }

    @Override
    public void output(int n) {
        if (n == -1) {
            System.out.println("不存在该用户");
        } else {
            System.out.println("用户名：" + userList.get(n) + "\t" + "密码：" + passwordList.get(n) + "\t" + "邮箱：" + emailList.get(n));
        }
    }

    @Override
    public void ergodic() {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println("用户名：" + userList.get(i) + "\t" + "密码：" + passwordList.get(i) + "\t" + "邮箱：" + emailList.get(i));
        }
    }
}
