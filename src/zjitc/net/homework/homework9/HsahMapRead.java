package zjitc.net.homework.homework9;

import zjitc.net.classwork.map.hashmap.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 杜源康
 * @date 2019-04-11 12:15
 * 从文本文件pan.txt中读取数据存储到集合HashMap中，并遍历集合
 */
public class HsahMapRead {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            File file = new File("homework9.1.txt");
            InputStreamReader read = new InputStreamReader(
            new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(read);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                hashMap.put(split[0], split[1]);
            }
            read.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Set<Map.Entry<String,String>> set = hashMap.entrySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator1.next();
            String key = entry.getKey();
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }
    }
}
