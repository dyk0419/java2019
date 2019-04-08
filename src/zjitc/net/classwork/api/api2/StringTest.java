package zjitc.net.classwork.api.api2;

/**
 * @Author admin
 * @Date 2019/3/27 8:20
 */
public class StringTest {
    public static void main(String[] args) {
        /*String的初始化*/
        String s1 = "hello";
        String s2 = new String();
        String s3 = new String("java");
        char[] c = {'m', 'y', 's', 'q', 'l'};
        String s4 = new String(c);


        System.out.println("============");
        String s5 = new String("hello");
        String s6 = new String("hello");
        /*equal比较引用类型。默认情况下，比较的是地址值是否相同。
          但是，我们可以根据自己的需要重写该方法。*/
        /* == 比较基本类型的值是否相等
         *  equal 比较引用类型的地址是否相等*/
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);


        String s7 = "hello";
        String s8 = "hello";
        System.out.println(s7.equals(s8));
        System.out.println(s7 == s8);

    }
}
