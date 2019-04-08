package zjitc.net.homework.homework3.tv;

/**
 * @author 杜源康
 * @date 2019-03-17 22:59
 */
public class Test {
    public static void main(String[] args) {
        TCL tcl=new TCL("TCL",65,true);
        Hisense hisense=new Hisense("Hisense",100,false);

        tcl.output();
        hisense.output();
    }
}
