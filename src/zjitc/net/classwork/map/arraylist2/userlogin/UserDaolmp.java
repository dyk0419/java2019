package zjitc.net.classwork.map.arraylist2.userlogin;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/29 10:43
 */
public class UserDaolmp implements UserDao {
    Scanner scanner = new Scanner(System.in);
    ArrayList userList=new ArrayList();
    ArrayList passwordList=new ArrayList();
    @Override
    public void regist(User user) {
        userList.add(user.getUserName());
        passwordList.add(user.getPassword());
        System.out.println("注册成功！");
    }

    @Override
    public boolean login(String userName, String password) {
        for (int i = 0; i <userList.size() ; i++) {
           /* String user= (String) userList.get(i);*/
            if (userName.equals(userList.get(i))){
               /* String pass= (String) passwordList.get(i);*/
                if (password.equals(passwordList.get(i))){
                    return true;
                }
            }
        }return false;
    }
}
