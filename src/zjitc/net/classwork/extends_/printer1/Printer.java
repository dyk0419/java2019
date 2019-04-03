package zjitc.net.classwork.extends_.printer1;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/15 11:15
 * 父类：共同的属性和方法提取到这个类
 */
public class Printer {
    public void open() {
        System.out.println("开机");
    }

    public void print() {
        System.out.println("打印");
    }

    public void close() {
        System.out.println("确定要关闭吗？");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        /*equalsIgnoreCase不区分大小写*/
        if (x.equalsIgnoreCase("y")) {
            System.out.println("关机");
        }
    }
}
