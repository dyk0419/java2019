package zjitc.net.classwork.interface_.express;

/**
 * @author 杜源康
 * @date 2019-03-24 22:15
 */
public class Express {
    String number;
    double weight;

    public Express() {
    }

    public Express(String number, double weight) {
        this.number = number;
        this.weight = weight;
    }

    public void sendBefore() {
        System.out.println("订单开始处理。。。");
        System.out.println("快递单号：" + getNumber());
        System.out.println("货物重量：" + getWeight());
        System.out.println("==============");
    }

    public void send(Car car) {
        System.out.println("运货人" + car.getDriver() + "正驾驶编号为" + car.getNumber() + "的" + car.getType() + "发送货物");
        car.transport();
        System.out.println("==============");
    }

    public void sendAfter(Car car) {
        System.out.println("货物运输任务完成！");
        System.out.println(car.getDriver() + "已将编号为" + car.getNumber() + "的" + car.getType() + "归还");
        /*想要用子类新增的方法时，需要用到多态的转型*/
        Truck truck = (Truck) car;
        truck.keep();

       /*((Truck) car).keep();*/
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
