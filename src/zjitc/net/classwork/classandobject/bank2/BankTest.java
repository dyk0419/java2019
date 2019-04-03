package zjitc.net.classwork.classandobject.bank2;

/**
 * @Author admin
 * @Date 2019/3/15 10:18
 */
public class BankTest {
    public static void main(String[] args) {
        Bank.bankName="招商银行";
        Bank bank=new Bank();
        bank.welcome();
        bank.open("小梦","123",100);
        bank.withdrawal("123",500);
        bank.bye();
    }
}
