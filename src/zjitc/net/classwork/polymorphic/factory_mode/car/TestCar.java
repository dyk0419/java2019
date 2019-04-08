package zjitc.net.classwork.polymorphic.factory_mode.car;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/19 16:13
 */
public class TestCar {
    public static void main(String[] args) {
        Driver driver = new Driver();
        System.out.println("选择你要开哪辆车？");
        System.out.println("1--BMW");
        System.out.println("2-QQ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        /*若getCar（）方法是静态方法，可以类名访问*/
        Car car = CarFactory.getCar(x);
        car.run();


        /*若不是静态方法*/
   /*     CarFactory cf=new CarFactory();
        Car car1=cf.getCar(x);
        car1.run();*/


        /*非工厂模式*/
/*     Car car;
     if (x==1){
         car=new BMW();
     }else{
         car=new QQ();
     }
     car.run();*/
    }
}
