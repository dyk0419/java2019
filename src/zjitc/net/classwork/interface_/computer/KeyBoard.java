package zjitc.net.classwork.interface_.computer;

/**
 * @Author admin
 * @Date 2019/3/22 11:07
 */
public class KeyBoard implements USB{
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
