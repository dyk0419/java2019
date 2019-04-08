package zjitc.net.homework.homework8.statisticalwords;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-04-09 01:11
 */
public class StatisticalWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一句英语，单词间以空格隔开 ：");
        String str = scanner.nextLine();
        HashMap<String, Integer> hm=new HashMap<>();    //定义一个双列集合
        String [] strs=str.split(" ");                                               //分割成若干字符串

        for (int i = 0; i < strs.length; i++) {                                  //判断每个字符串，是存在于集合里
            if (!hm.containsKey(strs[i])) {
                hm.put(strs[i], 1);				                  //如果不存在，则存进去 比如   Hello:1
            }else {
                Integer counts=hm.get(strs[i]);                        //如果存在 ，先找到 此key对应的 value值
                hm.put(strs[i], counts+1);		                 //覆盖前者的的key值，并且比前者多加一次
            }
        }

        //遍历
        Iterator<String> it=hm.keySet().iterator();                    //获取HashMap所有的key集合并遍历
        System.out.println("统计结果单词如下");
        while(it.hasNext()) {
            String keyName=it.next();
            System.out.println(keyName+":"+hm.get(keyName)+"次");

        }


    }
}
