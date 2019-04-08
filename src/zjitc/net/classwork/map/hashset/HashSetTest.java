package zjitc.net.classwork.map.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author admin
 * @Date 2019/4/2 16:36
 * HashSet:无序，唯一
 */
public class HashSetTest {
    /*定义3个Student对象（其中有2个对象元素相同）
    定义一个HashSet对象，往HashSet里加入这3个Student对象
    遍历*/
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        Student s2 = new Student("张三");
        Student s3 = new Student("李斯");

        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*能证明无序，但没有唯一？？？
         * 重写equals方法*/




        /*        ArrayList arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);*/
     /*   Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }*/
    }
}
