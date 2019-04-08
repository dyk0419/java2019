package zjitc.net.classwork.abstract_.shape;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/20 10:38
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle=new Circle(2);
        Shape triiangle=new Triangle(2,3);
        circle.output();
        triiangle.output();

        /*工厂模式*/
        System.out.println("选择？");
        System.out.println("1--圆形");
        System.out.println("2--三角形");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Shape shape=ShapeFactory.getShape(x);
        shape.output();
    }
}
