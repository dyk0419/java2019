package zjitc.net.pta.test2;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-18 19:14
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String string="";
        while(in.hasNextLine()){
            String s=in.nextLine();
            if(s.equals("end")){
                break;
            }
            else{
                string=string+s+"\n";
            }
        }
        String a=in.next();
        String b=in.next();
        System.out.println(string.replaceAll(a, b));
    }
}
