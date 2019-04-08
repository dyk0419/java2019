package zjitc.net.classwork.polymorphic.bank;

/**
 * @Author admin
 * @Date 2019/3/19 13:48
 */
public class Test_Bank {
    public static void main(String[] args) {
        /*普通的创建对象*/
        ConsBank consBank = new ConsBank(8000, 0.29, 5.236);
        consBank.compulnterest();
        WZBank wzBank = new WZBank(8000, 0.29, 5.236);
        wzBank.compulnterest();
        System.out.println("两个银行利息相差：" + (wzBank.compulnterest() - consBank.compulnterest()));

        /*用多态来创建对象
         * 使用父类，指向子类（子类的构造方法）
         * 父类与子类的继承关系
         * 重写*/
        Bank bank1 = new ConsBank(8000, 0.29, 5.123);
        /*调用的是子类重写的方法*/
        bank1.compulnterest();
    }
}
