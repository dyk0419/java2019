package zjitc.net.classwork.exception;

/**
 * @Author admin
 * @Date 2019/3/26 16:08
 */
public class Test2 {
    public static void main(String[] args) {
/*强制必须加try..catch*/
        System.out.println("1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("2");
        }

    }
}
