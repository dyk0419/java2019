package zjitc.net.classwork.abstract_.myclass;

/**
 * @Author admin
 * @Date 2019/3/20 11:50
 */
public class Undergraduate extends Student {
    public Undergraduate() {

    }

    public Undergraduate(String name) {
        super(name);
        this.type = "本科生";
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
        if (average >= 90) {
            this.courseGrade = "优秀";
        } else if (average >= 80 && average < 90) {
            this.courseGrade = "良好";
        } else if (average >= 70 && average < 80) {
            this.courseGrade = "中等";
        } else if (average >= 60 && average < 70) {
            this.courseGrade = "及格";
        } else {
            this.courseGrade = "不及格";
        }
    }
}
