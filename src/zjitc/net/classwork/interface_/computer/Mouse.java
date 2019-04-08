package zjitc.net.classwork.interface_.computer;

/**
 * @Author admin
 * @Date 2019/3/22 11:06
 */
public class Mouse implements USB {
    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
