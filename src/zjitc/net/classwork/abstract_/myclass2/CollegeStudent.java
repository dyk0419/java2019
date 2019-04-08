package zjitc.net.classwork.abstract_.myclass2;

/**
 * @Author admin
 * @Date 2019/3/20 11:44
 */
public class CollegeStudent extends Student {
    public CollegeStudent() {

    }

    /**
     * 初始化姓名，类别
     *
     * @param name
     */
    public CollegeStudent(String name) {
        super(name);
        this.type = "专科生";
    }

    @Override
    public void calculateGrade() {
        /*计算平均分*/
        double total = 0;
        double average = 0;
        for (int i = 0; i < courses.length; i++) {
            total += courses[i];
        }
        average = total / courseNo;
        if (average >= 80) {
            this.courseGrade = "优秀";
        } else if (average >= 70 && average < 80) {
            this.courseGrade = "良好";
        } else if (average >= 60 && average < 70) {
            this.courseGrade = "中等";
        } else if (average >= 50 && average < 60) {
            this.courseGrade = "及格";
        } else {
            this.courseGrade = "不及格";
        }
    }
}
