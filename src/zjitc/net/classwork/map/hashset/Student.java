package zjitc.net.classwork.map.hashset;

import java.util.Objects;

/**
 * @Author admin
 * @Date 2019/4/2 16:37
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 重写的原因
     * 输出的格式
     * print（user）隐含的就是调用user.toString
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * 重写的原因
     * 比较俩对象时，比较的是内容（若不重写，比较的是地址）
     * HashSet能保证元素唯一，必须重写这俩方法
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
