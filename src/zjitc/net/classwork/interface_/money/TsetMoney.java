package zjitc.net.classwork.interface_.money;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/22 10:41
 */
public class TsetMoney {
    public static void main(String[] args) {
        System.out.println("请选择想坐哪种车去看电影：1--公交车 2--出租车");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        Money money=MoneyFactory.setMoney(x);
        money.getMoney();
        Money moneyCinema=new Cinema();
        moneyCinema.getMoney();
    }
}
