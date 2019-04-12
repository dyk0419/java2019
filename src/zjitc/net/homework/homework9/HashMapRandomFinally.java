package zjitc.net.homework.homework9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/**
 * @Author admin
 * @Date 2019/4/12 11:19
 */
public class HashMapRandomFinally {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        Reader in = null;
        BufferedReader br = null;
        try {
            in = new FileReader("homework9.1.txt");
            br = new BufferedReader(in);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                hashMap.put(Integer.valueOf(array[0]), array[1]); //Integer.valueOf(array[0])做类型转换，
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*增加随机获取一个同学*/
        System.out.println("随机：");
        Random random = new Random();
        int r=random.nextInt(hashMap.size())+1;
        System.out.println(r+","+hashMap.get(r));
    }
}
