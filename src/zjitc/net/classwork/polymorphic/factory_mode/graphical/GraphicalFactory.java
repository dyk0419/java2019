package zjitc.net.classwork.polymorphic.factory_mode.graphical;

/**
 * @Author admin
 * @Date 2019/3/20 9:17
 */
public class GraphicalFactory {
    public static Graphical getGraphical(int x) {
        if (x == 1) {
            return new Rectangle();
        } else if (x == 2) {
            return new Circular();
        } else {
            return new Triangle();
        }
    }
}
