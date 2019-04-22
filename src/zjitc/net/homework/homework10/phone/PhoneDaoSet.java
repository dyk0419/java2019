package zjitc.net.homework.homework10.phone;

import java.util.ArrayList;

/**
 * @author 杜源康
 * @date 2019-04-22 16:54
 */
public class PhoneDaoSet implements PhoneDao {
    ArrayList<Phone> arrayList = new ArrayList<Phone>();

    @Override
    public void in(Phone phone) {
        arrayList.add(phone);
        System.out.println("入库成功");
    }

    @Override
    public Phone selectModel(String model) {
        return null;
    }

    @Override
    public Phone selectName(String name) {
        return null;
    }

    @Override
    public void selectAll() {

    }

    @Override
    public void delete(String model) {

    }
}
