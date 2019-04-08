package zjitc.net.classwork.polymorphic.factory_mode.graphical;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/20 9:10
 */
public class GraphicalTest {
    public static void main(String[] args) {
        System.out.println("选择？");
        System.out.println("1--长方形");
        System.out.println("2--圆形");
        System.out.println("3--三角形");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        /*工厂模式*/
        Graphical graphical=GraphicalFactory.getGraphical(x);
        graphical.s();






        /*非工厂模式*/
/*        Graphical graphical;
        if (x==1){
            graphical=new Rectangle();
        }else if(x==2){
            graphical=new Circular();
        }else{
            graphical=new Triangle();
        }
        graphical.s();*/
    }
}
