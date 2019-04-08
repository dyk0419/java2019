package zjitc.net.classwork.api.api2;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/27 8:29
 * 练习2：统计字符个数
 */
public class CountNumber {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        String x = scanner.nextLine();
        for (int i = 0; i < x.length(); i++) {
            char n = x.charAt(i);
            if (n >= '0' && n <= '9') {
                count1++;
            } else if (n >= 'a' && n <= 'z') {
                count2++;
            } else if (n >= 'A' && n <= 'Z') {
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
