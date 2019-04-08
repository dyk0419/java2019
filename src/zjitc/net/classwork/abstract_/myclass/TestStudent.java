package zjitc.net.classwork.abstract_.myclass;

/**
 * @author 杜源康
 * @date 2019-03-21 10:06
 */
public class TestStudent {
    public static void main(String[] args) {
        float[] array = {87, 90, 78};
        Student student1 = new CollegeStudent("张三");
        Student student2 = new CollegeStudent("李四");
        Student student3 = new Undergraduate("Jack");
        Student student4 = new Undergraduate("Lily");
        student1.setCourses(array);
        student1.calculateGrade();
        student2.setCourses(array);
        student2.calculateGrade();
        student3.setCourses(array);
        student3.calculateGrade();
        student4.setCourses(array);
        student4.calculateGrade();
        System.out.println("姓名" + "\t" + "\t" + "类型" + "\t" + "\t" + "等级");
        System.out.println(student1.getName() + "\t" + "\t" + student1.getType() + "\t" + student1.getCourseGrade());
        System.out.println(student2.getName() + "\t" + "\t" + student2.getType() + "\t" + student2.getCourseGrade());
        System.out.println(student3.getName() + "\t" + student3.getType() + "\t" + student3.getCourseGrade());
        System.out.println(student4.getName() + "\t" + student4.getType() + "\t" + student4.getCourseGrade());
    }
}
