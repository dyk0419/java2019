package zjitc.net.homework.homework8.sinaweibo;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-08 17:22
 * 编写一个模拟新浪微博用户注册的程序，要求使用HashSet集合实现。
 * 假设当用户输入用户名、密码、确认密码、手机号码、电子邮箱信息之后，
 * 判断信息输入是否正确（密码与确认密码要一致；手机号码应该长度11位，
 * 并且以13、15、17、18开头；电子邮箱中要包含@符号），正确验证用户是否重复注册，
 * 如果不是重复注册则注册成功。
 * 例如，用户信息列表中已经存在用户“张三”，当再次注册张三时，则输出：注册失败，用户重复！
 */
public class SinaWeiBoTest {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);
    static SinaWeiboDaolmp sinaWeiboDaolmp = new SinaWeiboDaolmp();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1 注册");
            System.out.println("2 退出");
            int n = scannerInt.nextInt();
            switch (n) {
                case 1:
                    register();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;

            }
        }
    }

    private static void register() {
        System.out.println("请输入用户名");
        String userName = scannerString.nextLine();
        System.out.println("请输入密码");
        String password = scannerString.nextLine();
        System.out.println("请在输入一次密码");
        String passwordenter = scannerString.nextLine();
        while (!passwordenter.equals(password)) {
            System.out.println("密码输入有误，请重新注册");
            passwordenter = scannerString.nextLine();
        }
        System.out.println("请输入手机号");
        String phonenumber = scannerString.nextLine();
        /*手机号码应该长度11位，并且以13、15、17、18开头*/
    /*   ! ((phonenumber.substring(0, 2) == "13" || phonenumber.substring(0, 2) == "15" ||
                phonenumber.substring(0, 2) == "17" || phonenumber.substring(0, 2) == "18") &&  phonenumber.length()==11)*/

        while (!(phonenumber.substring(0, 2).equals("13") || phonenumber.substring(0, 2) .equals("15") ||
                phonenumber.substring(0, 2).equals("17")|| phonenumber.substring(0, 2).equals("18")) || (phonenumber.length() != 11)) {
            System.out.println("手机号输入有误");
            phonenumber = scannerString.nextLine();
        }
        System.out.println("请输入电子邮箱");
        String email = scannerString.nextLine();
        while (!email.contains("@")) {
            System.out.println("输入有误，请重新输入");
            email = scannerString.nextLine();
        }
        User user = new User(userName, password, phonenumber, email);
         sinaWeiboDaolmp.regist(user);
    }
}
