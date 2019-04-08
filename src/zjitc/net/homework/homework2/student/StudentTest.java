package zjitc.net.homework.homework2.student;

/**
 * @author 杜源康
 * @date 2019-03-13 16:52
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student("杜源康",20,1610308202,"男");
        student.output();
        Student student1=new Student();
        student1.setName("杜源康2");
        student1.setAge(20);
        student1.setNum(1610308202);
        student1.setSex("男");
        student1.output();
    }
}
