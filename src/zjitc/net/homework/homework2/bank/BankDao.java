package zjitc.net.homework.homework2.bank;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-03-14 19:14
 */
public class BankDao {
    Scanner sc = new Scanner(System.in);
    Bank[] banksArray = new Bank[50];
    int count = 0;

    /**
     * 数组初始化
     */
    public void chushihua() {
        for (int i = 0; i < banksArray.length; i++) {
            Bank b = new Bank();
            banksArray[i] = b;
        }
    }

    public void welcome() {
        System.out.println("欢迎来到招商银行");
    }

    public void bye() {
        System.out.println("请携带好随身财物，欢迎下次光临招商银行———————————");
    }

    /**
     * 开户
     */
    public void openaccount() {
        System.out.println("请输入您的姓名");
        String name = sc.next();
        System.out.println("请输入您的密码");
        int password = sc.nextInt();
        System.out.println("请输入您要存入的金额");
        int keepmoney = sc.nextInt();
        Bank bank = new Bank(count, name, password, keepmoney, 0, keepmoney);
        banksArray[count] = bank;
        count++;
        banksArray[count].setMoney(keepmoney-10);
        System.out.println(name + "，开户成功，存入" + keepmoney + ",账户余额" + banksArray[count].getMoney());
    }

    /**
     * 存款
     */
    public void deposit() {
        System.out.println("请输入您的姓名");
        String name = sc.next();
        System.out.println("请输入您的密码");
        int password = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (banksArray[i].getUserName().equals(name)) {
                if (banksArray[i].getPassword() == password) {
                    System.out.println("请输入您要存入的金额");
                    int keepmonney = sc.nextInt();
                    banksArray[i].setMoney(banksArray[i].getMoney()+keepmonney);
                    System.out.println("您的账户余额："+banksArray[i].getMoney());
                } else {
                    System.out.println("您输入的密码错误");
                }
            } else {
                System.out.println("您还没开户");
            }
        }
    }

    /**
     * 取款
     */
    public void withdrawmoney() {
        System.out.println("请输入您的姓名");
        String name = sc.next();
        System.out.println("请输入您的密码");
        int password = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (banksArray[i].getUserName().equals(name)) {
                if (banksArray[i].getPassword() == password) {
                    System.out.println("请输入您要取出的金额");
                    int takemonney = sc.nextInt();
                    banksArray[i].setMoney(banksArray[i].getMoney()-takemonney);
                    System.out.println("您的账户余额："+banksArray[i].getMoney());
                } else {
                    System.out.println("您输入的密码错误");
                }
            } else {
                System.out.println("您还没开户");
            }
        }
    }

    public void checkthebalance() {
        System.out.println("请输入您的姓名");
        String name = sc.next();
        System.out.println("请输入您的密码");
        int password = sc.nextInt();
        for (int i = 0; i <count; i++) {
            if (banksArray[i].getUserName().equals(name)) {
                if (banksArray[i].getPassword() == password) {
                    banksArray[i].setMoney(banksArray[i].getMoney()-10);
                    System.out.println("您的账户余额："+banksArray[i].getMoney());
                } else {
                    System.out.println("您输入的密码错误");
                }
            }else{
                System.out.println("您还没开户");
            }
        }
    }

}
