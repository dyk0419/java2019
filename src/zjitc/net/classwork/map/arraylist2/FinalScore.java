package zjitc.net.classwork.map.arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/29 8:30
 */
public class FinalScore {
    public static void main(String[] args) {
        System.out.println("请输入裁判人数");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        System.out.println("请输入各个裁判的分数（以回车键结束）：");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < people; i++) {
            int n = scanner.nextInt();
            arrayList.add(n);
        }
        Collections.sort(arrayList);
        System.out.println("去掉一个最高分：" + arrayList.get(arrayList.size() - 1));
        System.out.println("去掉一个最低分：" + arrayList.get(0));
        arrayList.remove(0);
        arrayList.remove(arrayList.size() - 1);
        int resule = 0;
        /*    for (int i = 0; i < arrayList.size(); i++) {
         *//*元素放入集合后，集合会忘记元素的类型，都当成Object*//*
            int a= (int) arrayList.get(i);
            resule=resule+a;
        }*/
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int a = (int) iterator.next();
            resule = resule + a;
        }
        System.out.println("选手最后得分：" + (resule / arrayList.size()));

    }
}
