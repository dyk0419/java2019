package zjitc.net.classwork.exception;

/**
 * @Author admin
 * @Date 2019/3/26 15:54
 */
public class Test {
    public static void main(String[] args) {
        int result = 0;
        try {
//            可能出现异常的语句
            result = 4 / 0;
//            一旦上面语句出现异常，这条语句就不会执行了
            System.out.println("aaaa");
        } catch (Exception e) {
            System.out.println("出现异常了： " + e.getMessage());
//            出现异常后执行的语句
        } finally {
//            不管有没有异常 都会执行的语句
            System.out.println("result=" + result);
        }



        /*异常*/
//        int result=4/0;
//        System.out.println(result);
    }
}
