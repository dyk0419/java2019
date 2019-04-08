package zjitc.net.classwork.polymorphic.bank;

/**
 * @Author admin
 * @Date 2019/3/19 13:46
 */
public class Bank {
    int money;
    int year;
    double interest;
    double rate;

    public Bank() {
    }

    public Bank(int money, double rate) {
        this.money = money;
        this.rate = rate;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double compulnterest(){
        interest=year*money*rate;
        return interest;
    }
}
