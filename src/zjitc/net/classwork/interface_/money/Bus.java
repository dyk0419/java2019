package zjitc.net.classwork.interface_.money;

/**
 * @Author admin
 * @Date 2019/3/22 10:36
 */
public class Bus implements Money {
    @Override
    public void getMoney() {
        System.out.println("公交车收费2元");
    }
}
