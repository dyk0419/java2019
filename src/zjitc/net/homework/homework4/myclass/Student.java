package zjitc.net.homework.homework4.myclass;

/**
 * @Author admin
 * @Date 2019/3/20 11:35
 */
public abstract class Student {
    //课程数是所有对象共享的，不变
    final static int courseNo = 3;
    String type;
    String name;
    float[] courses;
    String courseGrade;

    public Student() {
    }

    /**
     * 构造方法：初始化name
     * 隐含初始化courses（数组）
     *
     * @param name
     */
    public Student(String name) {
        this.name = name;
        courses = new float[courseNo];
    }

    /**
     * 计算等级，抽象方法，让子类去写方法
     */
    public abstract void calculateGrade();

    public static int getCourseNo() {
        return courseNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getCourses() {
        return courses;
    }

    public void setCourses(float[] courses) {
        this.courses = courses;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public Student(String type, String name, float[] courses, String courseGrade) {
        this.type = type;
        this.name = name;
        this.courses = courses;
        this.courseGrade = courseGrade;
    }
}
