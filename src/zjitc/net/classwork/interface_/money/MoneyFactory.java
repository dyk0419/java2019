package zjitc.net.classwork.interface_.money;

/**
 * @Author admin
 * @Date 2019/3/22 10:45
 */
public class MoneyFactory {
    public static Money setMoney(int x){
        if (x==1){
            return new Bus();
        }else{
            return new Taxi();
        }


    }
}
