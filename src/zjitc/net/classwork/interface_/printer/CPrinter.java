package zjitc.net.classwork.interface_.printer;

/**
 * @Author admin
 * @Date 2019/3/22 10:21
 */
public class CPrinter implements Printer {
    public void clean(){
        System.out.println("打印");
    }
    @Override
    public void open() {
        System.out.println("Canon打开");
    }

    @Override
    public void print() {
        System.out.println("Canon打印");
    }

    @Override
    public void close() {
        clean();
        System.out.println("Canon关闭");
    }
}
