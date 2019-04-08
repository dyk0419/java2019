package zjitc.net.homework.homework2.bank;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-03-13 21:44
 */
public class BankTest {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);
    static Scanner scannerDouble = new Scanner(System.in);
    static BankDao dao = new BankDao();

    public static void main(String[] args) {
        dao.chushihua();
        while (true) {
            dao.welcome();
            System.out.println("请输入您要选择的服务");
            System.out.println("1.开户");
            System.out.println("2.存钱");
            System.out.println("3.取钱");
            System.out.println("4.查询余额");
            System.out.println("5.离开银行");

            int choose = scannerInt.nextInt();
            switch (choose) {
                case 1:
                    dao.openaccount();
                    break;
                case 2:
                    dao.deposit();
                    break;
                case 3:
                    dao.withdrawmoney();
                    break;
                case 4:
                    dao.checkthebalance();
                    break;
                case 5:
                    dao.bye();
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误！");
                    break;
            }
        }
    }
}
