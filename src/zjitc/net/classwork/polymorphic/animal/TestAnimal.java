package zjitc.net.classwork.polymorphic.animal;

/**
 * @Author admin
 * @Date 2019/3/19 15:51
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal kitty = new Cat();
        Animal bobi = new Dog();
        kitty.speak();
        bobi.speak();
        /*不能调用子类新增的方法*/
        /*kitty.skill();*/

        /*向下转型，可以调用子类新增的方法*/
        Cat c = (Cat) kitty;
        c.skill();

        ((Cat) kitty).skill();
    }

}
