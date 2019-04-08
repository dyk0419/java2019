package zjitc.net.homework.homework2.guessnumbergame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-03-13 17:13
 */
public class Guess {
    /**
     * 属性
     */
    private int ra;
    private int count = 1;

    public Guess(int ra, int count) {
        this.ra = ra;
        this.count = count;
    }

    public Guess() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }


    public int getRandom() {
        Random ra = new Random();
        int random = ra.nextInt(10);
        return random;
    }

    public void judge(int n) {
        Scanner sc = new Scanner(System.in);
        while (n != ra) {
            if (n > ra) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
            System.out.println("请继续");
            n = sc.nextInt();
            count++;
        }
        System.out.println("猜对了");
        System.out.println("共猜了" + count + "次");
    }

}
