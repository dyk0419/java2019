package zjitc.net.homework.homework3.dogandcat;

/**
 * @author 杜源康
 * @date 2019-03-17 21:26
 */
public class Animal {
    int leg;
    int eye;
    String name;

    public Animal(int leg, int eye, String name) {
        this.leg = leg;
        this.eye = eye;
        this.name = name;
    }

    public Animal() {
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foot() {
        System.out.println("走路");
    }
}
