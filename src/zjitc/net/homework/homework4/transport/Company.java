package zjitc.net.homework.homework4.transport;

/**
 * @Author admin
 * @Date 2019/3/19 16:56
 */
public class Company {
    public  Car manage(int n){
        if (n==1){
           return new Taxi();
        }else if (n==2){
            return new Bus();
        }else{
            return null;
        }
    }
}
