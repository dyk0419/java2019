package zjitc.net.pta.test1;

/**
 * @author 杜源康
 * @date 2019-04-02 22:58
 */
public class PtaTest12 {
    public static void main(String[] args) {
        int []num={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        float x1= (float) (sum/num.length);
        System.out.println(String.format("%.2f",x1));
/*        DecimalFormat df = new DecimalFormat(".00");
        System.out.println(df.format(x1));*/
    }
}
