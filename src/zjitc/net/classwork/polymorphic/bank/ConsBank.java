package zjitc.net.classwork.polymorphic.bank;

/**
 * @Author admin
 * @Date 2019/3/19 13:47
 */
public class ConsBank extends Bank{
    double year;

    public ConsBank() {
    }

    public ConsBank(int money, double rate, double year) {
        /*     this.money=money;
        this.rate=rate;
        调用父类的构造方法*/
        super(money, rate);
        this.year = year;
    }


    @Override
    public double compulnterest(){
        /*1.得到整数年*/
       super.year= (int) year;
       /*2.得到年利息*/
      double yearrate=super.compulnterest();

        int day=(int)((year-super.year)*1000);
        double dayrate=day*money*0.0001;
        double allrate=yearrate+dayrate;
        System.out.println(money+"元存在建设银行，"+(int)year+"年"+day+"天，利息是："+allrate);
        return allrate;
    }
}
