package zjitc.net.homework.homework5.express;

/**
 * @Author admin
 * @Date 2019/3/22 11:38
 */
public abstract class Car {
    String number;
    String type;
    String driver;

    public Car() {
    }

    public Car(String number, String type, String driver) {
        this.number = number;
        this.type = type;
        this.driver = driver;
    }

    public abstract void transport();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }


}
