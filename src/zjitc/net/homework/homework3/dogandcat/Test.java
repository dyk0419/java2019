package zjitc.net.homework.homework3.dogandcat;

/**
 * @author 杜源康
 * @date 2019-03-17 21:47
 */
public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        if (flag) {
            Dog dog = new Dog(4,2,"dog" );
            dog.foot();
            dog.www();
        } else {
            Cat cat = new Cat(4,2,"cat");
            cat.foot();
            cat.mmm();
        }
    }
}
