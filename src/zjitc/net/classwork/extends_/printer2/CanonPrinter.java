package zjitc.net.classwork.extends_.printer2;

/**
 * @Author admin
 * @Date 2019/3/15 11:21
 * 子类：继承父类
 * 1）继承了父类中除了私有的属性和方法之外的所有
 * （除了私有的，构造方法）
 * 就像在子类中定义的一样
 * 2）新增
 * 子类中可以新增加其他方法
 * 3）重写
 * 父类中的方法，子类可以重实现
 */
public class CanonPrinter extends Printer {
    public void clean() {
        System.out.println("清理");
    }

    /**
     * 重写
     * 子类重写了父类的close方法
     * 子类中又想调用父类close的方法
     * 加super
     */
    @Override
    public void close() {
        super.close();
        clean();
    }
}
