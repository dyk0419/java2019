package zjitc.net.homework.homework10.phone;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-22 16:53
 * 模仿下图结构，完成手机管理系统，假设手机的属性有型号、名称、颜色，
 * 完成手机管理系统，具体功能包括：入库功能（保存手机信息）、根据手
 * 机型号查询手机详细信息功能、根据手机名称查询手机详细信息功能、查看
 * 所有已入库手机详细信息功能、出库功能（删除该手机信息）。
 */
public class PhoneTest {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);
    static PhoneDao phoneDao = new PhoneDaoSet();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入你的选择：");
            System.out.println("1.入库");
            System.out.println("2.查询（根据型号）：");
            System.out.println("3.查询（根据名称）");
            System.out.println("4.查询所有");
            System.out.println("5.删除");
            System.out.println("6.退出");
            int n = scannerInt.nextInt();
            switch (n) {
                case 1:
                    inUI();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("欢迎下次光临");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    private static void inUI() {
        System.out.println("请输入手机型号：");
        String model = scannerString.nextLine();
        System.out.println("请输入手机姓名：");
        String name = scannerString.nextLine();
        System.out.println("请输入手机颜色：");
        String color = scannerString.nextLine();
        Phone phone=new Phone(model,name,color);
        phoneDao.in(phone);
    }
}

