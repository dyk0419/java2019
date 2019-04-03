package zjitc.net.classwork.classandobject.shopping;

/**
 * @Author admin
 * @Date 2019/3/12 14:58
 */
public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 表示顾客到某个超市去买某个商品
     * 若超市中存在该商品，则输出，顾客在超市，买到了商品
     * 若不存在，则输出，顾客白跑了，在超市中没有买到商品
     *
     * @param mName 超市对象
     * @param gName 商品名称
     */
    void shopping(Market mName, String gName) {
        Goods goods = mName.sell(gName);
        if (goods == null) {
            System.out.println(name + "白跑了一趟,在"
                    + mName.getmName() + "没有买到" + gName);
        }else{
            System.out.println(name + "在"
                    + mName.getmName() + "买到了" + gName
            );
        }
    }
}
