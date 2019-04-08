package zjitc.net.classwork.interface_.money;

/**
 * @Author admin
 * @Date 2019/3/22 10:36
 */
public class Taxi implements Money{
    @Override
    public void getMoney() {
        System.out.println("出租车收费11.0元");
    }
}
