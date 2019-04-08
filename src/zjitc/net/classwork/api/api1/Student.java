package zjitc.net.classwork.api.api1;

/**
 * @Author admin
 * @Date 2019/3/26 16:42
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
    /*ctrl+O
    * 重写父类的方法
    * alt+insert    Override Methods*/

    @Override
    public String toString() {
        return "Student:"+this.getName();
    }
}
