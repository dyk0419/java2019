package zjitc.net.classwork.interface_.express;

/**
 * @author 杜源康
 * @date 2019-03-24 22:36
 */
public class Test {
    public static void main(String[] args) {
        Express express=new Express("HYX0001",800.0);
        express.sendBefore();
        Car car=new Truck("A2025","","小王");
        express.send(car);
        express.sendAfter(car);

    }
}
