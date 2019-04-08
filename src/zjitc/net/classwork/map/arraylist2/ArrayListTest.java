package zjitc.net.classwork.map.arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author admin
 * @Date 2019/3/27 11:31
 */
public class ArrayListTest {


    public static void main(String[] args) {
        /*ArrayList 看做长度可变的数组，存储的是对象
         * 元素可重复，有序
         * 添加内容 add()
         * 取出内容 get()
         * 长度 size()*/
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("mysql");

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());

        /*用ArrayList存取整形、Student类型*/
        int a1 = 3, a2 = 5, a3 = 6;
        ArrayList list2 = new ArrayList();
        list2.add(a1);
        list2.add(a2);
        list2.add(a3);

        Student student1 = new Student("张三", 18);
        Student student2 = new Student("李斯", 18);
        ArrayList list3 = new ArrayList();
        list3.add(student1);
        list3.add(student2);
        System.out.println(list3.get(0));
        System.out.println();
        /*遍历方法一for*/
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        /*遍历方法二：foreach 每一个元素*/
        for (Object object : list3
        ) {
            System.out.println(object);
        }

        /*遍历方法三：Tterator 迭代器
         * 获取迭代器对象
         * hasNext()判断是否含有可迭代的元素
         * next()取出元素*/
        Iterator iterator = list3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /*用泛型，不需要强转，集合记得放入的是什么类型*/
        ArrayList<Student> arrayList1 = new ArrayList<Student>();
        arrayList1.add(student1);

        for (Student s : arrayList1
        ) {
            System.out.println(s);
        }


    }
}
