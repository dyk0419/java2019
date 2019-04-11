package zjitc.net.homework.homework9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author 杜源康
 * @date 2019-04-11 12:15
 */
public class HsahSetRead {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            File file = new File("homework9.1.txt");
            InputStreamReader read = new InputStreamReader(
            new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                String[] split = lineTxt.split(",");
                hashMap.put(split[0], split[1]);
            }
            read.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Iterator iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            /*迭代器中的元素都是key*/
            String key = (String) iterator.next();
            /*根据key得到value*/
            System.out.println(hashMap.get(key));
        }
    }
}
