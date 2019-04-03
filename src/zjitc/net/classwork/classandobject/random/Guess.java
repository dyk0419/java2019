package zjitc.net.classwork.classandobject.random;

import java.util.Random;

/**
 * @Author admin
 * @Date 2019/3/15 8:09
 */
public class Guess {
    /**
     * 属性
     */
    private int ra;
    private int count ;

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
        Random r = new Random();
        this.ra = r.nextInt(10);
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }


    public String judge(int n) {
        count++;
        if (n > ra) {
            return "bigger";
        } else if (n < ra) {
            return "smaller";
        } else {
            return "binGo";
        }
    }
}
