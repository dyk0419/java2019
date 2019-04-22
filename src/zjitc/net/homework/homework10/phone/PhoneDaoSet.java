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
    public int selectModel(String model) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (model.equals(arrayList.get(i).getModel())) {
                System.out.println("型号：" + arrayList.get(i).getModel() +
                        "\t" + "名字:" + arrayList.get(i).getName() +
                        "\t" + "颜色：" + arrayList.get(i).getColor());
                return 1;
            }
        }
        return -1;
    }

    @Override
    public int selectName(String name) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (name.equals(arrayList.get(i).getName())) {
                System.out.println("型号：" + arrayList.get(i).getModel() +
                        "\t" + "名字:" + arrayList.get(i).getName() +
                        "\t" + "颜色：" + arrayList.get(i).getColor());
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void selectAll() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("型号：" + arrayList.get(i).getModel() +
                    "\t" + "名字:" + arrayList.get(i).getName() +
                    "\t" + "颜色：" + arrayList.get(i).getColor());
        }
    }

    @Override
    public int delete(Phone phone) {
        for (int i = 0; i < arrayList.size(); i++) {
            if ((phone.getModel()).equals(arrayList.get(i).getModel()) &&
                    (phone.getName()).equals(arrayList.get(i).getName()) &&
                    (phone.getColor()).equals(arrayList.get(i).getColor())) {
                arrayList.remove(i);
                return 1;
            }
        }
        return -1;
    }
}
