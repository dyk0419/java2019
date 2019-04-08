package zjitc.net.homework.homework2.bank;

/**
 * @author 杜源康
 * @date 2019-03-13 21:44
 */
public class Bank {
    private int name;
    private String userName;
    private int password;
    private double keepmoney;
    private double takemoney;
    private double money;

    public Bank() {
    }

    public Bank(int name, String userName, int password, double keepmoney, double takemoney, double money) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.keepmoney = keepmoney;
        this.takemoney = takemoney;
        this.money = money;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getKeepmoney() {
        return keepmoney;
    }

    public void setKeepmoney(double keepmoney) {
        this.keepmoney = keepmoney;
    }

    public double getTakemoney() {
        return takemoney;
    }

    public void setTakemoney(double takemoney) {
        this.takemoney = takemoney;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
