package zjitc.net.homework.homework9.process;

import zjitc.net.homework.homework9.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 杜源康
 * @date 2019-04-10 22:59
 * 把HashMap集合中的数据存储到文本文件pan.txt
 * 自打版
 */
public class HashMapWrite2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "柯旭海");
        Student s2 = new Student(2, "宋自江");
        Student s3 = new Student(3, "李斯");
        Student s4 = new Student(4, "张三");
        Student s5 = new Student(5, "王五");
        Student s6 = new Student(6, "赵六");
        HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(s1.getNum(), s1);
        hashMap.put(s2.getNum(), s2);
        hashMap.put(s3.getNum(), s3);
        hashMap.put(s4.getNum(), s4);
        hashMap.put(s5.getNum(), s5);
        hashMap.put(s6.getNum(), s6);

        Writer out =null;
        BufferedWriter bw=null;

        try {
           out=new FileWriter("d:\\HashMapWrite2.txt");
           bw=new BufferedWriter(out);

            Iterator iterator = hashMap.keySet().iterator();

            while (iterator.hasNext()) {
                Integer key = (Integer) iterator.next();
                Student s=hashMap.get(key);
                bw.write(s.getNum()+","+s.getName());
                bw.newLine();
            }
           bw.flush();
/*            String line = System.getProperty("line.separator");
            StringBuffer str = new StringBuffer();
            out = new FileWriter("homework9.txt");
            Set key1 = hashMap.keySet();

            Student s = hashMap.get(key1);
            bw = new BufferedWriter(out);
            bw.write(key1 + String.valueOf(key1));
            bw.flush();*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
