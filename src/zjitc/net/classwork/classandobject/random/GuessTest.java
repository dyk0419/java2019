package zjitc.net.classwork.classandobject.random;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/15 8:14
 */
public class GuessTest {
    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.getRa();
        System.out.println("随机数已经产生");
        String result = "";
        do {
            System.out.println("请输入您猜测的值");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           result= guess.judge(n);
            System.out.println(result);
        } while (!result.equals("binGo"));
        System.out.println("共猜测了" + guess.getCount() + "次");
        System.out.println("Game Over!");
    }
}
