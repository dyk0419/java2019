package zjitc.net.classwork.polymorphic.animal;

/**
 * @Author admin
 * @Date 2019/3/19 15:48
 */
public class Cat extends Animal {
    @Override
    public void speak(){
        System.out.println("喵喵喵");
    }

    public void skill(){
        System.out.println("skr");
    }
}
