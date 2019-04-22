package zjitc.net.pta.MN0419;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-19 10:30
 */
public class Test1 {
   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int n=inputNum();
        int m=inputNum();
        System.out.println(Math.max(n,m));

    }
    public static int inputNum() {
        int x=0;
        while(true) {
            x=scanner.nextInt();
            if(Math.abs(x)<=1000) {
               break;
            }
        } return x;
    }
}
