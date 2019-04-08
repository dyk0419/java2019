package zjitc.net.classwork.map.arraylist2.userlogin;

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
            System.out.println("3 退出");
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
        User user = new User(userName, password);
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
}
