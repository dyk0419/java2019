package zjitc.net.homework.homework7.userlogin;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/29 10:54
 */
public class UserTest {
    static UserDaolmp userDaolmp = new UserDaolmp();
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    /*让注册登录使用一个集合！！！*/
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------欢迎光临-----------");
            System.out.println("1 注册");
            System.out.println("2 登录");
            System.out.println("3 搜索");
            System.out.println("4 查看所有用户");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");
            int n = scannerInt.nextInt();
            UserDaolmp userDaolmp = new UserDaolmp();
            switch (n) {
                case 1:
                    regist();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    ergodic();
                    break;
                case 5:
                    System.out.println("欢迎下次使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }

    }


    public static void regist() {
        System.out.println("请输入用户名：");
        String userName = scannerString.nextLine();
        System.out.println("请输入密码：");
        String password = scannerString.nextLine();
        System.out.println("请输入邮箱:");
        String email = scannerString.nextLine();
        User user = new User(userName, password, email);
        userDaolmp.regist(user);
    }

    public static void login() {
        Random random = new Random();
        int r = random.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入用户名：");
            String userName = scannerString.nextLine();
            System.out.println("请输入密码：");
            String password = scannerString.nextLine();
            boolean flag = userDaolmp.login(userName, password);
            if (flag) {
                System.out.println("登陆成功");
                System.out.println("请输入你要猜的数据（1-100）");
                int num = scannerInt.nextInt();
                if (num > r) {
                    System.out.println("你猜的数据" + num + "大了");
                } else if (num < r) {
                    System.out.println("你猜的数据" + num + "小了");
                } else if (num == r) {
                    System.out.println("恭喜你，猜中了");
                    System.exit(0);
                }
            } else {
                System.out.println("请重新输入");
            }
        }
    }

    public static void search() {
        System.out.println("请输入用户名：");
        String userName = scannerString.nextLine();
        int n = userDaolmp.search(userName);
        userDaolmp.output(n);
    }

    private static void ergodic() {
        userDaolmp.ergodic();
    }
}
