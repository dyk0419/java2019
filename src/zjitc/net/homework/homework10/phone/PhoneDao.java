package zjitc.net.homework.homework10.phone;

/**
 * @author 杜源康
 * @date 2019-04-20 16:17
 */
public interface PhoneDao {
    void in(Phone phone);
    Phone selectModel(String model);
    Phone selectName(String name);
    void selectAll();
    void delete(String model);
}
