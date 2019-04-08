package zjitc.net.homework.homework7;

import java.util.ArrayList;

/**
 * @author 杜源康
 * @date 2019-03-31 14:21
 */
public class ArrayStudentList {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("林志玲", 40);
        Student s3 = new Student("凤姐", 35);
        Student s4 = new Student("芙蓉姐姐", 18);
        Student s5 = new Student("翠花", 16);
        Student s6 = new Student("林青霞", 27);
        Student s7 = new Student("林青霞", 18);
        ArrayList namelist = new ArrayList();
        ArrayList agelist = new ArrayList();
        namelist.add(s1.getName());
        namelist.add(s2.getName());
        namelist.add(s3.getName());
        namelist.add(s4.getName());
        namelist.add(s5.getName());
        namelist.add(s6.getName());
        namelist.add(s7.getName());
        agelist.add(s1.getAge());
        agelist.add(s2.getAge());
        agelist.add(s3.getAge());
        agelist.add(s4.getAge());
        agelist.add(s5.getAge());
        agelist.add(s6.getAge());
        agelist.add(s7.getAge());

        /*姓名和年龄加到不同arraylist中*/


        for (int i = 0; i < namelist.size(); i++) {
            for (int j = i + 1; j < agelist.size(); j++) {
                if (namelist.get(i).equals(namelist.get(j))) {
                    if (agelist.get(i).equals(agelist.get(j))) {
                        namelist.remove(namelist.get(j));
                        agelist.remove(agelist.get(j));
                    }
                }
            }
        }
        for (int i = 0; i < namelist.size(); i++) {
            System.out.println(namelist.get(i)+"\t"+agelist.get(i));
        }
    }
}
