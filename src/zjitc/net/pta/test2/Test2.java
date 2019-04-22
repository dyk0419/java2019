package zjitc.net.pta.test2;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-18 19:23
 */
public class Test2 {
  static   Scanner scannerInt = new Scanner(System.in);
  static   Scanner scannerString = new Scanner(System.in);
    public static void main(String[] args) {

        String x = scannerString.nextLine();
        switch (x) {
            case "fib":
                int n = scannerInt.nextInt();
                Fibonacci(n);
                break;
            case "sort":
             number();
                break;
            case "search":

                break;
            case "getBirthDate":

                break;
            default:
                System.out.println("exit");
                break;
        }
    }

    private static void number() {
        String num=scannerString.nextLine();

    }

    public static int Fibonacci(int n) {
        int a = 1, b = 1, c = 0;
        if (n < 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                b = a;
                a = c;
            }
            return c;
        }
    }

}
