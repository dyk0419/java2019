package zjitc.net.homework.homework9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author admin
 * @Date 2019/4/12 10:19
 * 老师版（和我不一样的地方在HashMap的泛型是<Integer, String>）
 * 1.创建集合对象
 * 2.添加元素
 * 3.把集合中元素写入文件
 *     遍历集合：
 *     1）取出一个元素
 *     2）用字符缓冲流写入
 *     3）刷新
 *
 *     关闭流
 */
public class HashMapWriteFinally {
    public static void main(String[] args) {
        Student s1 = new Student(1, "柯旭海");
        Student s2 = new Student(2, "宋自江");
        Student s3 = new Student(3, "李斯");
        Student s4 = new Student(4, "张三");
        Student s5 = new Student(5, "王五");
        Student s6 = new Student(6, "赵六");
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(s1.getNum(), s1.getName());
        hashMap.put(s2.getNum(), s2.getName());
        hashMap.put(s3.getNum(), s3.getName());
        hashMap.put(s4.getNum(), s4.getName());
        hashMap.put(s5.getNum(), s5.getName());
        hashMap.put(s6.getNum(), s6.getName());

        Writer out =null;
        BufferedWriter bw=null;

        try {
            out=new FileWriter("d:\\HashMapWriteFinally.txt");
            bw=new BufferedWriter(out);

//          Iterator iterator = hashMap.keySet().iterator();
            Set<Integer> set=hashMap.keySet();
            Iterator iterator=set.iterator();

            while (iterator.hasNext()) {
                /*取1个键*/
                Integer key = (Integer) iterator.next();
                String value=hashMap.get(key);
                bw.write(key+","+value);
                bw.newLine();
            }
            bw.flush();
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
