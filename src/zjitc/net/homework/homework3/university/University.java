package zjitc.net.homework.homework3.university;

/**
 * @author 杜源康
 * @date 2019-03-17 21:59
 */
public class University {
    double math;
    double english;
    double chinese;
    double sport;

    public University() {
    }

    public University(double math, double english, double chinese, double sport) {
        this.math = math;
        this.english = english;
        this.chinese = chinese;
        this.sport = sport;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getSport() {
        return sport;
    }

    public void setSport(double sport) {
        this.sport = sport;
    }

    public void enter() {
        double totalscore = math + english + chinese;

        if (totalscore >= 180 && sport >= 60) {
            System.out.println("恭喜！3门课总分为：" + totalscore + " ,且体育达标，达到大学录取线");
        } else {
            System.out.println("您落榜了");
        }
    }
}
