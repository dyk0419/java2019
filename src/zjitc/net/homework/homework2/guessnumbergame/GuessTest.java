package zjitc.net.homework.homework2.guessnumbergame;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-03-13 17:14
 */
public class GuessTest {
    public static void main(String[] args) {
        Guess guess=new Guess();
        int random=guess.getRandom();

        System.out.println("请输入您猜测的值");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        guess.judge(n);
    }
}
