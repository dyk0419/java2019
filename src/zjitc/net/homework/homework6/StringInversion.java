package zjitc.net.homework.homework6;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-03-27 22:11
 */
public class StringInversion {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        char[] x1 = x.toCharArray();
        StringBuffer stringBuffer=new StringBuffer(String.valueOf(x1));
        System.out.println(stringBuffer.reverse());

    }
}
