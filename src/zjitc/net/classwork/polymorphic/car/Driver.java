package zjitc.net.classwork.polymorphic.car;

/**
 * @Author admin
 * @Date 2019/3/19 16:09
 */
public class Driver {
    /*run方法一直在重载*/
/*    public void run(BMW bmw){
        bmw.run();
    }
    public void run(QQ qq){
        qq.run();
    }*/

    public void run(Car car) {
        car.run();
    }
}
