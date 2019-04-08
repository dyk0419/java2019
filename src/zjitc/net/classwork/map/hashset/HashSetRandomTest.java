package zjitc.net.classwork.map.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @Author admin
 * @Date 2019/4/2 16:51
 */
public class HashSetRandomTest {
    public static void main(String[] args) {
        /*HsahSet存放的是整形的包装类型Integer*/
        HashSet<Integer> hashSet=new HashSet<Integer>();
        Random random=new Random();
        while (hashSet.size()<10){
            int n=random.nextInt(40)+1;
            hashSet.add(n);
        }
        System.out.println("这些随机数是：");
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }

    }
}
