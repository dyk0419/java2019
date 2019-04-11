package zjitc.net.homework.homework9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HashSetWrite {

    /**
     * @param args
     */
    public static void main(String[] args) {
// TODO Auto-generated method stub

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

        try {
            String line = System.getProperty("line.separator");
            StringBuffer str = new StringBuffer();
            FileWriter fw = new FileWriter("homework9.1.txt", true);
            Set set = hashMap.entrySet();
            Iterator iter = set.iterator();
            while(iter.hasNext()){
                Map.Entry entry = (Map.Entry)iter.next();
                str.append(entry.getValue()).append(line);
//                str.append(entry.getKey()+" : "+entry.getValue()).append(line);
            }
            fw.write(str.toString());
            fw.close();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
