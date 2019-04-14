package zjitc.net.homework.homework9.ktyio;

import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/3 8:12
 */
public class Test {
    static SongDaolmp daolmp = new SongDaolmp();
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----点歌系统-----");
        System.out.println("0---添加歌曲");
        System.out.println("1---置顶歌曲");
        System.out.println("2---歌曲前移一位");
        System.out.println("3---退出");


        daolmp.init();
        while (true) {
            System.out.println("请输入要执行的序号");
            int a = scannerInt.nextInt();
            switch (a) {
                case 0:
                    System.out.println("请输入要添加的歌曲名称");
                    String name = scannerString.nextLine();
                    Song song = new Song(name);
                    daolmp.add(song);
                    /*显示所有歌曲*/
                    daolmp.all();
                    break;
                case 1:
                    System.out.println("输入要置顶的歌曲名称");
                    name = scannerString.nextLine();
                    daolmp.top(name);
                    daolmp.all();
                    break;
                case 2:
                    System.out.println("输入要前移的歌曲名");
                    name = scannerString.nextLine();
                    /*先判断是否存在该歌曲
                     * 若存在，返回歌曲对象，若不存在返回null*/
                    Song music = daolmp.select(name);
                    if (music == null) {
                        System.out.println("当前歌曲列表没有此歌曲");
                    } else {
                        /*调用方法完成歌曲前移*/
                        daolmp.before(music);
                    }
                    daolmp.all();
                    break;
                case 3:
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

}
