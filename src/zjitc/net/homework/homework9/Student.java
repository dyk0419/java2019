package zjitc.net.homework.homework9;

import java.util.Objects;

/**
 * @author 杜源康
 * @date 2019-04-10 22:59
 */
public class Student {
    int num;
    String name;

    public Student() {
    }

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return num + "," + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return num == student.num &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }
}
