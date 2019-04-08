package zjitc.net.homework.homework3.tv;

/**
 * @author 杜源康
 * @date 2019-03-17 22:49
 */
public class TV {
    String brand;
    double size;

    public TV() {
    }

    public TV(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void output(){
        System.out.println("电视机牌子："+brand+"\t"+"电视机尺寸"+size);
    }
}
