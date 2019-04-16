package zjitc.net.classwork.summary.user;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author admin
 * @Date 2019/4/16 14:11
 */
public class UserDaoIO implements UserDao {
    ArrayList<User> arrayList = new ArrayList<User>();
    @Override
    public void regist(User user) {
        User u = select(user.getUsername());
        if (u == null) {
            arrayList.add(user);
            System.out.println("注册成功");



            BufferedWriter bw = null;
            Writer out = null;
            try {
                out = new FileWriter("D:\\user.txt");
                bw = new BufferedWriter(out);

                String line=user.getUsername()+","+user.getPsaaword()+","+user.getEmail();
                    bw.write(line);
                    bw.newLine();

                bw.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    if (out != null) {
                        out.close();
                    }
                    if (bw!=null){
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
        return null;
    }
}
