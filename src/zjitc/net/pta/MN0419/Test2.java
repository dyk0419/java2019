package zjitc.net.pta.MN0419;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-19 10:48
 */
public class Test2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int r = scanner.nextInt();
        System.out.println("The area for the circle of radius " + r + " is " + (r * r * 3.14));
    }

/*    public static int inputNum() {
        int x = 0;
        while (true) {
            x = scanner.nextInt();
            if (x >= 0 && x <= 100) {
                break;
            }
        }
        return x;
    }*/
}
