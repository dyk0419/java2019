package zjitc.net.classwork.abstract_.shape;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/20 10:43
 */
public class ShapeFactory {
    public static Shape getShape(int n){
        Scanner scanner = new Scanner(System.in);
        if (n==1){
            System.out.println("r=？");
            double r=scanner.nextDouble();
            return new Circle(r);
        }else if (n==2){
            System.out.println("a=？");
            double a=scanner.nextDouble();
            System.out.println("h=？");
            double h=scanner.nextDouble();
            return new Triangle(a,h);
        }else{
            return null;
        }
    }
}
