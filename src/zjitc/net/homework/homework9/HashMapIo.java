package zjitc.net.homework.homework9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 杜源康
 * @date 2019-04-10 22:59
 * 把HashMap集合中的数据存储到文本文件pan.txt
 */
public class HashMapIo {
    public static void main(String[] args) {
        Student s1 = new Student(1,"柯旭海");
        Student s2 = new Student(2,"宋自江");
        Student s3 = new Student(3,"李斯");
        Student s4 = new Student(4,"张三");
        Student s5 = new Student(5,"王五");
        Student s6 = new Student(6,"赵六");
        HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(s1.getNum(), s1);
        hashMap.put(s2.getNum(), s2);
        hashMap.put(s3.getNum(), s3);
        hashMap.put(s4.getNum(), s4);
        hashMap.put(s5.getNum(), s5);
        hashMap.put(s6.getNum(), s6);
        BufferedWriter bw=null;
        Writer out=null;

        try {
            String line = System.getProperty("line.separator");
            StringBuffer str = new StringBuffer();
            out=new FileWriter("homework9.txt");
            Set key1=hashMap.keySet();
            bw=new BufferedWriter(out);
            bw.write(String.valueOf(key1));
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
