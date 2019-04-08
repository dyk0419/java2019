package zjitc.net.classwork.interface_.printer;

/**
 * @Author admin
 * @Date 2019/3/22 10:20
 */
public class HPPrinter implements Printer {

    @Override
    public void open() {
        System.out.println("HP打开");
    }

    @Override
    public void print() {
        System.out.println("HP打印");
    }

    @Override
    public void close() {
        System.out.println("HP关闭");
    }
}
