package zjitc.net.pta.test1;

/**
 * @author 杜源康
 * @date 2019-04-16 23:25
 */
public class DaffilTest {
    public static void main(String[] args) {
        for (int number = 100; number <= 100000; number++) { //求10到10000之间所有的素数，一个大的循环
            int temp = number; //这步代码是为了让Getlength(number)不变
            int sum = 0;
            for (int i = 0; i < Getlength(number); i++) {
                sum += Math.pow(temp % 10, Getlength(number)); //次方和相加
                temp = temp / 10;
            }
            if (sum == number) { //判断是否相等
                System.out.print(number+" ");
            }
        }
    }
    static int Getlength(int number) { //这个函数是为了求一个数字的位数
        int i = 0;
        while (number / 10 > 0) {
            i++;
            number /= 10;
        }
        return i + 1;
    }
}
