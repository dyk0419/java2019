package zjitc.net.homework.homework4.transport;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/3/19 17:05
 */
public class TsetTransport {
    public static void main(String[] args) {
        System.out.println("选择你要乘坐哪辆车？");
        System.out.println("1--出租车");
        System.out.println("2--公交车");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Company company = new Company();
        Car car = company.manage(x);
        car.use();
    }
}
