package zjitc.net.pta.test1;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-16 22:11
 */
public class PtaTest23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num=scanner.nextLine();
        String[]array=num.split(" ");
        int a=Integer.decode(array[0]);
        int b= Integer.decode(array[1]);
        System.out.println(a+b);
    }
}
