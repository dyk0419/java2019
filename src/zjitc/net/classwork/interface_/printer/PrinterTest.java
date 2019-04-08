package zjitc.net.classwork.interface_.printer;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/22 10:23
 */
public class PrinterTest {
    public static void main(String[] args) {
        System.out.println("请输入您的选择1-HP  2-Canon");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //方法加静态了才能用类名调用
        Printer printer = PrinterFactory.getPrinter(x);
        printer.open();
        printer.print();
        printer.close();


/*        if (x==1){
            HPPrinter hpPrinter=new HPPrinter();
            hpPrinter.open();
            hpPrinter.print();
            hpPrinter.close();
        }else{
          CPrinter cPrinter=new CPrinter();
          cPrinter.open();
          cPrinter.print();
          cPrinter.close();
        }*/
    }
}
