package zjitc.net.homework.homework9;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author admin
 * @Date 2019/4/12 10:35
 * 从文本文件中读取数据存到HashMap中，并遍历集合
 */
public class HashMapReadFinally {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        Reader in=null;
        BufferedReader br=null;
        try {
           /* 考虑是不是需要使用转换流
           *  用下面这种创建方式不能构造使用什么编码规则
           *  InputStreamReader in = new FileReader("homework9.1.txt");
           *  上面这种方法是百度的
           *
           *
           *  下面的方法老师教的
           * in = new FileInputStream("文件地址");
            InputStreamReader isr = new InputStreamReader(in,"UTF-8" );
            BufferedReader br = new BufferedReader(isr);
           *  */
            in = new FileReader("homework9.1.txt");
            br = new BufferedReader(in);
            String line = null;
            while ((line = br.readLine()) != null) {
                /*split方法，根据给定正则表达式的匹配拆分此字符串。
                * 返回：字符串数组*/
                String[] array = line.split(",");
                hashMap.put(Integer.valueOf(array[0]), array[1]); //Integer.valueOf(array[0])做类型转换，
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            Integer key= (Integer) iterator.next();
            System.out.println(key+","+hashMap.get(key));
        }
    }
}
