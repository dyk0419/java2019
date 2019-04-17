package zjitc.net.classwork.summary.user;

import java.util.ArrayList;


/**
 * @Author admin
 * @Date 2019/4/16 14:11
 */
public class UserDaoSet implements UserDao {
    ArrayList<User> arrayList = new ArrayList<User>();

    @Override
    public void regist(User user) {
        User u = select(user.getUsername());
        if (u == null) {
            arrayList.add(user);
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败，重复了");
        }
    }

    public User select(String userName) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getUsername().equals(userName)) {
                return arrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public User login(String username, String password) {
        User u = select(username);
        if (u!=null){
            if (password.equals(u.getPsaaword())){
                return u;
            }else{
                return null;
            }
        }
        return null;
    }

    @Override
    public void ergodic() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("用户名："+arrayList.get(i).getUsername()+
                    "\t"+"密码："+arrayList.get(i).getPsaaword()+
                    "\t"+"邮箱："+arrayList.get(i).getEmail());
        }
    }

    @Override
    public int delete(String username, String password) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getUsername().equals(username)&&arrayList.get(i).getPsaaword().equals(password)){
                arrayList.remove(i);
                return 1;
            }
        }
        return 0;
    }
}
