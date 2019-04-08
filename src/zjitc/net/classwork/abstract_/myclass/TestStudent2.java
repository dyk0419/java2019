package zjitc.net.classwork.abstract_.myclass;

/**
 * @Author admin
 * @Date 2019/3/22 9:10
 */
public class TestStudent2 {
    public static void main(String[] args) {
        Student[]students=new Student[4];

        students[0] = new CollegeStudent("张三");
        students[1] = new CollegeStudent("李四");
        students[2] = new Undergraduate("Jack");
        students[3] = new Undergraduate("Lily");
        float[]score={87,90,78};
        for (int i = 0; i < students.length; i++) {
            students[i].setCourses(score);
            students[i].calculateGrade();
        }
        System.out.println("姓名" + "\t" +  "类型" + "\t"  + "等级");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "\t" + students[i].getType() + "\t" + students[i].getCourseGrade());
        }
    }
}
