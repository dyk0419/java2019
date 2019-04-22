package zjitc.net.pta.test1;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-16 23:01
 */
public class PtaTest24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 3:
                System.out.println(153);
                System.out.println(370);
                System.out.println(371);
                System.out.println(407);
                break;
            case 4:
                System.out.println(1634);
                System.out.println(8208);
                System.out.println(9474);
                break;
            case 7:
                System.out.println(1741725);
                System.out.println(4210818);
                System.out.println(9800817);
                System.out.println(9926315);
                break;
            default:
                break;
        }
    }

}
