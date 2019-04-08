package zjitc.net.classwork.interface_.interfaces;

/**
 * @Author admin
 * @Date 2019/3/22 9:30
 * 实现类（就是子类）
 * <p>
 * 必须重写接口中的所有方法（抽象方法）
 * 单继承，多实现
 */
public class Cat extends Aminal implements Police, Pet {

    @Override
    public void catching() {
        System.out.println("猫抓老鼠");
    }

    @Override
    public void friendly() {
        System.out.println("猫很友好");
    }
}
