package zjitc.net.classwork.summary.user;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author admin
 * @Date 2019/4/16 14:11
 */
public class UserDaoIO implements UserDao {
    ArrayList<User> arrayList = new ArrayList<User>();
    ArrayList<User> arrayList2 = new ArrayList<User>();

    @Override
    public void regist(User user) {
        User u = select(user.getUsername());
        if (u == null) {
            arrayList.add(user);
            System.out.println("注册成功");


            BufferedWriter bw = null;
            Writer out = null;
            try {
                out = new FileWriter("D:\\user.txt", true);
                bw = new BufferedWriter(out);

                String line = user.getUsername() + "," + user.getPsaaword() + "," + user.getEmail();
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
                    if (bw != null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
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
        Reader in = null;
        BufferedReader br = null;

        try {
            in = new FileReader("D:\\user.txt");
            br = new BufferedReader(in);

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
              /*  if (s[0].equals(username)&&s[1].equals(password)){
                    User user=new User(s[0],s[1],s[2]);
                    return user;
                }*/
                User user = new User(s[0], s[1], s[2]);
                arrayList2.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i).getUsername().equals(username) && arrayList2.get(i).getPsaaword().equals(password)) {
                return arrayList2.get(i);
            }
        }
        return null;
    }

    @Override
    public void ergodic() {
        Reader in = null;
        BufferedReader br = null;

        try {
            in = new FileReader("D:\\user.txt");
            br = new BufferedReader(in);

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                System.out.println("用户名：" + s[0] + "\t" + "密码：" + s[1] + "\t" + "邮箱：" + s[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
/*        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println("用户名："+arrayList2.get(i).getUsername()+
                    "\t"+"密码："+arrayList2.get(i).getPsaaword()+
                    "\t"+"邮箱："+arrayList2.get(i).getEmail());
        }*/
    }

    @Override
    public int delete(String username, String password) {
        return 0;
    }

    public void delete2(String username, String password) {
/*        Reader in = null;
        BufferedReader br = null;
        try {
            in = new FileReader("D:\\user.txt");
            br = new BufferedReader(in);

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
              *//*  if (s[0].equals(username)&&s[1].equals(password)){
                    User user=new User(s[0],s[1],s[2]);
                    return user;
                }*//*
                User user = new User(s[0], s[1], s[2]);
                arrayList2.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        int j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getUsername().equals(username) && arrayList.get(i).getPsaaword().equals(password)) {
                arrayList.remove(i);
                j = 1;
            } else {
                j = 2;
            }
        }
        if (j == 1) {
            System.out.println("删除成功");
        } else if (j == 2) {
            System.out.println("删除失败，用户名或密码错误");
        }

        BufferedWriter bw = null;
        Writer out = null;
        try {
            out = new FileWriter("D:\\user.txt");
            bw = new BufferedWriter(out);

            for (int i = 0; i < arrayList.size(); i++) {
                String line2 = arrayList.get(i).getUsername() + "," + arrayList.get(i).getPsaaword() + "," + arrayList.get(i).getEmail();
                bw.write(line2);
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
