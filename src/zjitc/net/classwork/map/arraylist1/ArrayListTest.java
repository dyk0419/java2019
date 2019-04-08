package zjitc.net.classwork.map.arraylist1;

import java.util.ArrayList;

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
        int a1=3,a2=5,a3=6;
        ArrayList list2=new ArrayList();
        list2.add(a1);
        list2.add(a2);
        list2.add(a3);

        Student student1=new Student("张三",18);
        Student student2=new Student("李斯",18);
        ArrayList list3=new ArrayList();
        list3.add(student1);
        System.out.println(list3.get(0));

        /*遍历*/
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
