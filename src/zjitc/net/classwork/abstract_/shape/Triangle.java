package zjitc.net.classwork.abstract_.shape;

/**
 * @Author admin
 * @Date 2019/3/20 10:33
 */
public class Triangle extends Shape {
    double a;
    double h;

    public Triangle() {
    }

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return a*h/2;
    }

    @Override
    public String getName() {
        return "三角形";
    }

    @Override
    public void output() {
        System.out.println(getName()+"的面积是："+area());
    }
}
