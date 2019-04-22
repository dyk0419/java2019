package zjitc.net.homework.homework10.phone;

/**
 * @author 杜源康
 * @date 2019-04-20 15:36
 */
public class Phone {
    String model;
    String name;
    String color;

    public Phone() {
    }

    public Phone(String model, String name, String color) {
        this.model = model;
        this.name = name;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
