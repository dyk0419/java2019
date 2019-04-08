package zjitc.net.homework.homework5.computer;

/**
 * @Author admin
 * @Date 2019/3/22 11:06
 */
public class Mic implements USB {
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
