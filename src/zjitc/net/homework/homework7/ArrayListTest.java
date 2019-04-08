package zjitc.net.homework.homework7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 杜源康
 * @date 2019-03-31 14:03
 * 1、集合操作
 * 1）创建一个ArrayList集合对象，保存String类型元素。
 * 2）往该集合对象中添加若干个元素（至少4、5个元素，其中包含值为“hello”的元素）
 * 3）遍历该集合所有元素
 * 4）移除集合中的第2个元素
 * 5）判断集合中是否存在值为“hello”的元素，若存在则移除
 * 6）再次遍历集合
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        String x1 = "java", x2 = "ruby", x3 = "yes", x4 = "yuki", x5 = "hello";
        arrayList.add(x1);
        arrayList.add(x2);
        arrayList.add(x3);
        arrayList.add(x4);
        arrayList.add(x5);
        /*遍历*/
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*移除第二个元素*/
        arrayList.remove(1);

        /*判断集合中是否存在值为“hello”的元素，若存在则移除*/
        if (arrayList.contains("hello")){
            arrayList.remove(arrayList.indexOf("hello"));
        }

        /*遍历*/
        System.out.println("再次遍历：");
        Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
