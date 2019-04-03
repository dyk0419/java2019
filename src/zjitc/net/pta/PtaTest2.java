package zjitc.net.pta;

import java.util.Arrays;

/**
 * @Author admin
 * @Date 2019/4/2 13:54
 */
public class PtaTest2 {
    public static void main(String[] args) {
        int[] a = {1, 7, 9, 11, 13, 17, 19};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i]=b[i];
        }
        Arrays.sort(c);
        for (int x = 0; x < c.length; x++) {
            if (x!=c.length-1){
                System.out.print(c[x]+" ");
            }else{
                System.out.println(c[x]);
            }

        }
    }
}
