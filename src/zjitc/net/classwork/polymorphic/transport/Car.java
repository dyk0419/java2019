package zjitc.net.classwork.polymorphic.transport;

/**
 * @Author admin
 * @Date 2019/3/19 16:52
 */
public class Car {
    String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void use(){
        System.out.println("car");
    }
}
