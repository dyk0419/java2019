package zjitc.net.classwork.polymorphic.transport;

/**
 * @Author admin
 * @Date 2019/3/19 16:56
 */
public class Company {
    public void Car_manage(int n){
        if (n==1){
            Car bus=new Bus();
            bus.use();
        }else {
            Car taxi=new Taxi();
            taxi.use();
        }
    }
}
