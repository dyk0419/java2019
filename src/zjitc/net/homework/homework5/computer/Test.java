package zjitc.net.homework.homework5.computer;

/**
 * @Author admin
 * @Date 2019/3/22 11:29
 */
public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        USB mouse=new Mouse();
        USB mic=new Mic();
        USB keyBoard=new KeyBoard();
        computer.add(mouse);
        computer.add(mic);
        computer.add(keyBoard);
        computer.powerOn();
        System.out.println();
        computer.powerOff();
    }
}
