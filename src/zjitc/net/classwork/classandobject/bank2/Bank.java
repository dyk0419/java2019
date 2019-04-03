package zjitc.net.classwork.classandobject.bank2;

/**
 * @Author admin
 * @Date 2019/3/15 9:19
 */
public class Bank {
    static String bankName;
    private String userName;
    private String password;
    private double balance;
    private double amount;

    public Bank() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Bank(String userName, String password, double amount) {
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    public Bank(String bankName, String userName, String password, double balance, double amount) {
        /*调用构造方法Bank(userName, password, amount)
        * 一定要写在构造方法第一行，只能用在构造方法
        * 等价于下面3条语句*/
        this(userName, password, amount);
           /*    this.userName = userName;
        this.password = password;
        this.amount = amount;*/
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void welcome() {
        System.out.println("欢迎来到" + this.bankName + "————————");
    }

    public void bye() {
        System.out.println("请携带好随身财物，欢迎下次光临" + this.bankName + "——————");
    }

    public void open(String userName, String password, double amount) {

        this.userName = userName;
        this.password = password;
        this.amount = amount;
        /*账户余额*/
        this.balance = amount - 10;
        System.out.println("开户成功，存入" + amount + "账户余额：" + balance);
    }

    public void withdrawal(String password, double amount) {
        if (!password.equals(this.password)) {
            System.out.println("您输入的密码错误");

        } else if (amount > balance) {
            System.out.println("对不起，账户余额不足！");
        } else {
            balance = balance - amount;
            System.out.println(userName + "您好！您的账户已取出" + amount + "元，当前余额" + balance);
        }
    }
}
