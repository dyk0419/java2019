package zjitc.net.classwork.polymorphic.car;

/**
 * @Author admin
 * @Date 2019/3/19 16:13
 */
public class TestCar {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car bmw = new BMW();
        driver.run(bmw);
        Car qq = new QQ();
        driver.run(qq);
    }
}
