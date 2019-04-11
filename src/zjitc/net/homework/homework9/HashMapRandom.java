package zjitc.net.homework.homework9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author 杜源康
 * @date 2019-04-11 23:52
 */
public class HashMapRandom {
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
        Integer[] keys = hashMap.keySet().toArray(new Integer[0]);
        Random random = new Random();
        Integer randomKey = keys[random.nextInt(keys.length)];
        String randomValue = hashMap.get(randomKey);
    }
}
