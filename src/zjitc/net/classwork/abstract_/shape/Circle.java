package zjitc.net.classwork.abstract_.shape;

/**
 * @Author admin
 * @Date 2019/3/20 10:28
 * 子类继承抽象类，必须重写其抽象方法
 */
public class Circle extends Shape{
    double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public String getName() {
        return "圆";
    }

    @Override
    public void output() {
        System.out.println(getName()+"的面积是："+area());
    }

    /*父类抽象化之后不能创建父类的对象*/
    /*  Shape shape= new Shape() */
}
