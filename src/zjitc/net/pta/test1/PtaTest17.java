package zjitc.net.pta.test1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/9 14:19
 */
public class PtaTest17 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入评委人数");
            int ratern = sc.nextInt();
                System.out.println("请评委们为选手打分：");
                double[] arr1 = new double[ratern];
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = sc.nextDouble();
                }
                //            做比较⬇
                for (int i = 0; i < arr1.length; i++) {
                    int j = i;
                    while (j > 0 && (arr1[j] > arr1[j - 1])) {
                        double temp = arr1[j];
                        arr1[j] = arr1[j - 1];
                        arr1[j - 1] = temp;
                        j--;
                    }
                }
                //            输出最大值最小值
                System.out.println("去掉最高分：" + arr1[0] + "\t" + "去掉最低分:" + arr1[ratern - 1]);
                double grade = 0;
                for (int i = 1; i < arr1.length - 1; i++) {
                    grade = grade + arr1[i];
                }
                double averatern = ratern - 2;
                //        保存最后得分到新数组
                double finall = grade / averatern;
//        保留一位小数
                DecimalFormat df = new DecimalFormat(".00");
                System.out.println("选手最后得分是：" + df.format(finall));
            }

        }


