package zjitc.net.classwork.map.arraylist2;

import java.util.ArrayList;

/**
 * @Author admin
 * @Date 2019/3/29 9:13
 */
public class RemoveDuplication {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList array = new ArrayList();
        // 添加多个字符串元素(包含内容相同的)
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("java");
        array.add("world");

        for (int i = 0; i < array.size(); i++) {
         /*   String a = (String) array.get(i);*/
            /*取出要比较的元素*/
            for (int j = i+1; j <array.size(); j++) {
                /*String s = (String) array.get(j);*/
                if (array.contains(array.get(j))){
                    array.remove(array.get(j));
                    System.out.println(array);
                }
            }
        }
    /*    Iterator iterator=array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}

