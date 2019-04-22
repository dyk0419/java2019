package zjitc.net.homework.homework10.phone;

/**
 * @author 杜源康
 * @date 2019-04-20 16:17
 */
public interface PhoneDao {
    void in(Phone phone);
    int selectModel(String model);
    int selectName(String name);
    void selectAll();
    int delete(Phone phone);
}
