package zjitc.net.classwork.summary.user;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/16 14:10
 */
public class UserTest {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    static UserDao userDao = new UserDaoIO();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入您的选择");
            System.out.println("1.注册");
            System.out.println("2.登陆");
            System.out.println("3.退出");
            int n = scannerInt.nextInt();
            switch (n) {
                case 1:
                    regist();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("欢迎下次光临");
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    private static void regist() {
        System.out.println("请输入用户名");
        String userName = scannerString.nextLine();
        System.out.println("请输入密码");
        String password = scannerString.nextLine();
        System.out.println("请输入邮箱");
        String email = scannerString.nextLine();
        User user = new User(userName, password,email);
        userDao.regist(user);
    }

    private static void login() {
        System.out.println("请输入用户名");
        String userName = scannerString.nextLine();
        System.out.println("请输入密码");
        String password = scannerString.nextLine();
        User user=userDao.login(userName, password);
        if (user==null){
            System.out.println("登陆失败");
        }else{
            System.out.println("登陆成功！欢迎"+user.getUsername());
        }
    }
}
