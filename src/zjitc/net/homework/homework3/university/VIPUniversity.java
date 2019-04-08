package zjitc.net.homework.homework3.university;

/**
 * @author 杜源康
 * @date 2019-03-17 21:59
 */
public class VIPUniversity extends University {
    public VIPUniversity() {
    }

    public VIPUniversity(double math, double english, double chinese, double sport) {
        super(math, english, chinese, sport);
    }

    @Override
    public void enter(){
        double totalscore = math + english + chinese+sport;

        if (totalscore >= 290) {
            System.out.println("恭喜！4门课总分为：" + totalscore + " ,达到重点大学录取线");
        } else {
            System.out.println("您未被重点大学录取");
        }
    }
}
