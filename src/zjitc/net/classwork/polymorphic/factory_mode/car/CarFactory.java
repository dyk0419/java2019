package zjitc.net.classwork.polymorphic.factory_mode.car;

/**
 * @Author admin
 * @Date 2019/3/20 8:25
 */
public class CarFactory {
    public static Car getCar(int type) {
        switch (type) {
            case 1:
                return new BMW();
            case 2:
                return new QQ();
            default:
                return new Car();
        }


/*        if (type == 1) {
            return new BMW();
        } else if (type == 2) {
            return new QQ();
        } else {
            return new Car();
        }*/
    }
}
