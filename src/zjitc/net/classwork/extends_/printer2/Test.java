package zjitc.net.classwork.extends_.printer2;

/**
 * @Author admin
 * @Date 2019/3/15 11:30
 */
public class Test {
    public static void main(String[] args) {
        boolean flag = false;
/*        if (flag) {
            HPPrinter hp = new HPPrinter();
            hp.open();
            hp.print();
            hp.close();
        } else {
            CanonPrinter canon = new CanonPrinter();
            canon.open();
            canon.print();
            canon.close();
        }*/
        Printer printer;
        if (flag) {
            printer = new HPPrinter();

        } else {
            printer = new CanonPrinter();
        }
        printer.open();
        printer.print();
        printer.close();
    }
}
