package zjitc.net.classwork.abstract_.shape;

/**
 * @Author admin
 * @Date 2019/3/20 10:18
 */
public abstract class Shape {
    /*方法加abstract，该方法不用方法体，直接加分号
    * 父类也要加abstract
    * 子类必须重写*/
    public abstract double area();
    public abstract String getName();
    public abstract void output();
}
