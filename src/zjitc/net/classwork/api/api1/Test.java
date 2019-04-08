package zjitc.net.classwork.api.api1;

/**
 * @Author admin
 * @Date 2019/3/26 16:43
 */
public class Test {
    public static void main(String[] args) {
        Student student=new Student("张三");
        /*类中没有定义toString
        * Object类中有toString方法
        * Student继承Object
        * Object是所有类的根类*/
        System.out.println(student.toString());
        /*下面这条隐含的调用了该对象的toString方法*/
        System.out.println(student);
        Student student1=new Student("张三");
        /*没有经过任何处理时，equals比较的是地址是否相等*/
        System.out.println(student.equals(student1));
        System.out.println(student.getName().equals(student1.getName()));

        /*让equals比较的值是否相等*/

    }
}
