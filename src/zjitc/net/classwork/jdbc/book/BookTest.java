package zjitc.net.classwork.jdbc.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/26 8:41
 */
public class BookTest {
    static Scanner scannerString = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerDouble = new Scanner(System.in);
    static BookDaoDB bookDaoDB = new BookDaoDB();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择");
            System.out.println("1.增加");
            System.out.println("2.更新");
            System.out.println("3.删除");
            System.out.println("4.查询");
            System.out.println("5.退出");
            int n = scannerInt.nextInt();
            switch (n) {
                case 1:
                    addUI();
                    break;
                case 2:
                    updateUI2();
                    break;
                case 3:
                    deleteUI();
                    break;
                case 4:
                    selectUI();
                    break;
                case 5:
                    System.out.println("欢迎下次");
                    closeUI();
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }

    }

    private static void addUI() {
        System.out.println("请输入图书名称");
        String bookname = scannerString.nextLine();
        System.out.println("请输入出版社");
        String press = scannerString.nextLine();
        System.out.println("请输入作者");
        String author = scannerString.nextLine();
        System.out.println("请输入价格");
        double price = scannerDouble.nextDouble();
        Book book = new Book(bookname, press, author, price);
        int c = bookDaoDB.add(book);
        if (c > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    private static void updateUI() {
//        根据输入需要修改的项目来修改，这里需要写4条，mysql里set后面的列名需要写4次，这里只写了一个bookname

        System.out.println("请输入要修改的项目");
        String project = scannerString.nextLine();

        if (project.equals("price")) {
            System.out.println("请输入价格");
            double price = scannerDouble.nextDouble();
            System.out.println("请输入要修改的图书id");
            int bookid = scannerInt.nextInt();
            int c = bookDaoDB.update(project, price, bookid);
            if (c > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
        } else {
            System.out.println("请输入内容");
            String content = scannerString.nextLine();
            System.out.println("请输入要修改的图书id");
            int bookid = scannerInt.nextInt();
            int c = bookDaoDB.update(project, content, bookid);
            if (c > 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
        }
    }

    private static void updateUI2() {
//        这里是传入整个对象，替换整条
        System.out.println("请输入图书名称");
        String bookname = scannerString.nextLine();
        System.out.println("请输入出版社");
        String press = scannerString.nextLine();
        System.out.println("请输入作者");
        String author = scannerString.nextLine();
        System.out.println("请输入价格");
        double price = scannerDouble.nextDouble();
        Book book = new Book(bookname, press, author, price);
        int c = bookDaoDB.update2(book);
        if (c > 0) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败，图书重复了");
        }
    }

    private static void deleteUI() {
        System.out.println("请输入要删除的图书id");
        int id = scannerInt.nextInt();
        int c = bookDaoDB.delete(id);
        if (c > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    private static void selectUI() {
        ArrayList arrayList = bookDaoDB.select();
     /*   for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }*/

        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            /*上面没有用泛型，所以这里要强转*/
           Book book= (Book) iterator.next();
        }
    }

    private static void closeUI() {
        bookDaoDB.close();
    }
}
