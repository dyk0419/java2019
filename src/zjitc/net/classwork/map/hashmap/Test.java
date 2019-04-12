package zjitc.net.classwork.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author admin
 * @Date 2019/4/3 10:29
 * HashMap就是一个容器，存储多列，每个元素包含一对键值对
 * key唯一，value可以重复
 */
public class Test {
    public static void main(String[] args) {
        /*创建HashMap<Integer,Student>对象，添加元素（键值对），遍历输出所有元素*/
        HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
        /*key唯一，所以可以把Student的id作为key
         * 这样根据key能很方便找到value*/
        Student s1 = new Student(1, "张三");
        Student s2 = new Student(2, "李斯");
        Student s3 = new Student(2, "张三");
        hashMap.put(s1.getId(), s1);
        hashMap.put(s2.getId(), s2);
        hashMap.put(s3.getId(), s3);

        /*当key重复了，其实覆盖了原有的*/
        hashMap.put(1, s2);
        /*通过key得到值*/

        System.out.println(hashMap.get(s2.getId()));


        /*便利输出所有元素
         * 第一种遍历方法：键找值
         * 1、先得到迭代器对象
         *    1）hashmap的entrySet()方法得到集合set
         *    2）set集合的iterator() 获得迭代器对象
         * 循环：判断迭代器中是否有元素
         *       若有，取出该元素
         *
         * */
/*        先得到所有键的集合(Set<>  Set接口，HashSet就是实现Set接口)
        Set<Integer> set=hashMap.keySet();
        得到迭代器对象（通过集合的iterator()）
        Iterator iterator=set.iterator();*/

        Iterator iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            /*迭代器中的元素都是key*/
            Integer key = (Integer) iterator.next();
            /*根据key得到value*/
            System.out.println("--------" +key+ hashMap.get(key));
        }
        /*第二种遍历方法：键值对对象找键和值
         * 1、先得到迭代器对象
         *    1）hashmap的entrySet()方法得到集合set
         *    2）set集合的iterator() 获得迭代器对象
         * 循环：判断迭代器中是否有元素
         *       若有，取出该元素
         *       该元素是键值对，根据键值对获取key，在根据key获取value*/

        System.out.println("第二种遍历方法：");
        Set<Map.Entry<Integer, Student>> set = hashMap.entrySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, Student> entry = (Map.Entry<Integer, Student>) iterator1.next();
            Integer key = entry.getKey();
            Student value = hashMap.get(key);
            System.out.println(value);
        }

    }
}
