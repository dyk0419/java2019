package zjitc.net.classwork.classandobject.phone;

/**
 * @Author admin
 * @Date 2019/3/12 14:09
 */
public class Phone {
    /*定义属性*/
    private String brand;
    private String model;
    private int price;


    /*封装方法，分别用来设置和获取属性值*/
    void setPrice(int price) {
        if (price < 0) {
            System.out.println("价格不能为负数");
        } else {
            this.price = price;
        }
    }

    int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    /*定义方法*/
    void phoneshuchu() {
        System.out.println(brand + model + price);
    }
}
