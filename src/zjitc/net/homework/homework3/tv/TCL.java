package zjitc.net.homework.homework3.tv;

/**
 * @author 杜源康
 * @date 2019-03-17 22:50
 */
public class TCL extends TV {
    boolean cloud;

    public TCL(boolean cloud) {
        this.cloud = cloud;
    }

    public TCL(String brand, double size, boolean cloud) {
        super(brand, size);
        this.cloud = cloud;
    }

    public TCL() {
    }

    public TCL(String brand, double size) {
        super(brand, size);
    }

    @Override
    public void output() {
        if (cloud == false) {
            super.output();
        } else {
            System.out.println("电视机牌子："+brand+"\t"+"电视机尺寸"+size+"\t"+"是云电视");
        }
    }
}
