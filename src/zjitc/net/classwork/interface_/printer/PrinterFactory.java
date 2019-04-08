package zjitc.net.classwork.interface_.printer;

/**
 * @Author admin
 * @Date 2019/3/22 10:29
 */
public class PrinterFactory {
    //方法加静态了才能用类名调用
    public static Printer getPrinter(int x) {
        if (x == 1) {
            return new HPPrinter();

        } else {
            return new CPrinter();
        }
    }
}
