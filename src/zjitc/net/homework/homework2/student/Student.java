package zjitc.net.homework.homework2.student;

/**
 * @author 杜源康
 * @date 2019-03-13 16:50
 */
public class Student {
    private String name;
    private int age;
    private int num;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, int num, String sex) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void output() {
        System.out.println("姓名:" + name + "\t" + "年龄：" + age + "\t" + "学号:" + num + "\t" + "性别:" + sex);
    }
}
