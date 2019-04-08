package zjitc.net.homework.homework3.tv;

/**
 * @author 杜源康
 * @date 2019-03-17 22:50
 */
public class Hisense extends TV{
    boolean d3;

    public Hisense(boolean d3) {
        this.d3 = d3;
    }

    public Hisense(String brand, double size, boolean d3) {
        super(brand, size);
        this.d3 = d3;
    }

    public Hisense() {
    }

    public Hisense(String brand, double size) {
        super(brand, size);
    }

    public boolean isD3() {
        return d3;
    }

    public void setD3(boolean d3) {
        this.d3 = d3;
    }
    @Override
    public void output() {
        if (d3 == false) {
            super.output();
        } else {
            System.out.println("电视机牌子："+brand+"\t"+"电视机尺寸"+size+"\t"+"是3D电视");
        }
    }
}
