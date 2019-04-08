package zjitc.net.classwork.api.api2;

import java.util.Random;

/**
 * @Author admin
 * @Date 2019/3/27 10:47
 */
public class RandomTest {
    public static void main(String[] args) {
           int random=(int)(Math.random()*100+1);
        System.out.println("使用Math方法生成1-100之间的随机数");
        Random r=new Random();
        System.out.println("使用ramdom生成int随机数："+r.nextInt());
        System.out.println("使用ramdom生成1-100随机数："+r.nextInt(100)+1);
        System.out.println("使用ramdom()构造方法生成5个随机数（执行2次值不同）："+r.nextInt(100)+1);
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt(100));
        }
        Random r2=new Random(5);
        System.out.println("使用Random（long）构造方法生成5个随机数（执行两次值一样）");
        for (int i = 0; i < 5; i++) {
            System.out.println(r2.nextInt(100));
        }
    }
}
