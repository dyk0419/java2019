package zjitc.net.homework.homework5.computer;

/**
 * @Author admin
 * @Date 2019/3/22 11:09
 */
public class Computer {
    USB[] usbs = new USB[3];
    int count = 0;
    public void add(USB usb) {
        usbs[count] = usb;
        count++;
    }

    public void powerOn() {
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].turnOn();
        }
        System.out.println("计算机开机成功");
    }

    public void powerOff() {
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].turnOff();
        }
        System.out.println("计算机关机成功");
    }


}
