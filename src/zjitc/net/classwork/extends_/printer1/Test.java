package zjitc.net.classwork.extends_.printer1;

/**
 * @Author admin
 * @Date 2019/3/15 11:30
 */
public class Test {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag) {
            HPPrinter hp = new HPPrinter();
            hp.open();
            hp.print();
            hp.close();
        } else {
            CanonPrinter canon = new CanonPrinter();
            canon.open();
            canon.print();
            canon.close();
        }
    }
}
