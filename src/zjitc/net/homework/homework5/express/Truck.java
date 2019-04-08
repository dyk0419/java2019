package zjitc.net.homework.homework5.express;

/**
 * @author 杜源康
 * @date 2019-03-24 22:09
 */
public class Truck extends Car implements Maintain{
    public Truck() {
    }

    public Truck(String number, String type, String driver) {
        super(number, type, driver);
        this.type="小卡车";
    }

    @Override
    public void transport() {
        System.out.println("快递运输中。。。");
    }

    @Override
    public void keep() {
        System.out.println("货物运输车保养完成");
    }
}
