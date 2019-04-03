package zjitc.net.classwork.classandobject.people;

/**
 * @Author admin
 * @Date 2019/3/15 10:42
 */
public class Test {
    public static void main(String[] args) {
        People p1=new People();
        People p2=new People();
        People.country="中国";
        System.out.println(People.country);
        System.out.println(p2.country);
    }
}
