package zjitc.net.classwork.classandobject.shopping;

/**
 * @Author admin
 * @Date 2019/3/12 15:00
 */
/*
 * 属性：超市名称，商品数组
 * 方法：封装方法，卖货*/
public class Market {
    private String mName;
    private Goods[] goodsArray;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Goods[] getGoodsArray() {
        return goodsArray;
    }

    public void setGoodsArray(Goods[] goodsArray) {
        this.goodsArray = goodsArray;
    }

    /**
     * 遍历商品数组，若数组中存在该商品，则返回该商品对象
     * 若不存在，返回null
     *
     * @param gName
     * @return
     */
    Goods sell(String gName) {
        for (int i = 0; i < goodsArray.length; i++) {
            if (goodsArray[i].getgName().equals(gName)) {
                return goodsArray[i];
            }
        }
        return null;
    }
}
