package zjitc.net.pta.test1;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/2 14:40
 */
public class PtaTest3 {
    public static void main(String[] args) {
        System.out.println("输入一个任意位数的正数");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
//定义一个变量存储各个位数之和
        int sum = 0;
//定义一个变量用来存储中间商的值
        int result = in;
        do {
//通过每次%10的方式获得当前个位数字，讲商进行下一次循环
            int num = result % 10;
            result = result / 10;
            sum += num;
        } while (result != 0);
        System.out.println(sum);

    }
}
