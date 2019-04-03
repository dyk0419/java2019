package zjitc.net.classwork.classandobject.shopping;

/**
 * @Author admin
 * @Date 2019/3/12 16:08
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * 创建若干个商品对象
         * 创建超市对象
         * 超市对象中添加一些商品
         * 创建顾客对象
         * 调用顾客对象的shopping方法
         */
        Goods goods1 = new Goods();
        goods1.setgName("茶叶蛋");
        Goods goods2 = new Goods();
        goods2.setgName("作业");

        Market market = new Market();
        market.setmName("十足");
        Goods[] goods = {goods1, goods2};
        market.setGoodsArray(goods);

        Customer customer = new Customer();
        customer.setName("小王");
        customer.shopping(market, "茶叶蛋");
        customer.shopping(market, "女装");
    }
}
