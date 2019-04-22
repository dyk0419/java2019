package zjitc.net.pta.test1.ptaTest4;

/**
 * @Author admin
 * @Date 2019/4/2 15:53
 */
public class Person {
    private String name;
    private boolean gender;
    private int age;
    private int id;

    public Person() {
        System.out.println("This is constructor");
    }

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
