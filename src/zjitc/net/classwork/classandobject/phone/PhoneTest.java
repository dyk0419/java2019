package zjitc.net.classwork.classandobject.phone;

/**
 * @Author admin
 * @Date 2019/3/12 14:32
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("华为");
        phone.setModel("mate x");
        /*私有属性不能直接访问*/
        /* phone.price=-10;*/
        /*通过set和get去获取和设置属性值*/
        phone.setPrice(-10);
        phone.phoneshuchu();
        System.out.println("年龄是：" + phone.getPrice());
    }
}
