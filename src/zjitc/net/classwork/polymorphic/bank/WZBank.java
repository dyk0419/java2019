package zjitc.net.classwork.polymorphic.bank;

/**
 * @Author admin
 * @Date 2019/3/19 13:48
 */
public class WZBank extends Bank{
    double year;

    public WZBank() {
    }

    public WZBank(int money, double rate, double year) {
        super(money, rate);
        this.year = year;
    }
    @Override
    public double compulnterest(){
        super.year=(int)year;
        double yearrate=super.compulnterest();
        int day=(int) ((year-super.year)*1000);
        double dayrate=day*money*0.0002;
        double allrate=yearrate+dayrate;
        System.out.println(money+"元存在温州银行，"+(int)year+"年"+day+"天，利息是："+allrate);
        return allrate;
    }
}
