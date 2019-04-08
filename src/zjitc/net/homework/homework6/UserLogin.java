package zjitc.net.homework.homework6;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/27 8:39
 */
public class UserLogin {
    public static void main(String[] args) {
        String name = "admin";
        String psaaword = "admin";
        int count = 2;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count + 1; i++) {
            System.out.println("请输入用户名");
            String name1 = scanner.nextLine();
            System.out.println("请输入密码");
            String psaaword1 = scanner.nextLine();
            if (name1.equals(name)) {
                if (psaaword1.equals(psaaword)) {
                    System.out.println("登陆成功");
                    game();
                }
            } else if (count - i == 0) {
                System.out.println("登陆失败，账号被锁定，请联系客服");
            } else {
                System.out.println("登陆失败，你还有" + (count - i) + "次机会");
            }
        }
    }
    public static void game(){
        Random random=new Random();
        int r=random.nextInt(100)+1;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要猜的数据（1-100）");
            int num=scanner.nextInt();
            if (num>r){
                System.out.println("你猜的数据"+num+"大了");
            }else if (num<r){
                System.out.println("你猜的数据"+num+"小了");
            }else if (num==r){
                System.out.println("恭喜你，猜中了");
                System.exit(0);
            }
        }
    }
}
