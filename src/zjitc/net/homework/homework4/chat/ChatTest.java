package zjitc.net.homework.homework4.chat;

import java.util.Scanner;

/**
 * @author 杜源康
 * @date 2019-03-21 10:27
 */
public class ChatTest {
    public static void main(String[] args) {
        System.out.println("选择你要使用那个通信工具？");
        System.out.println("1--微博");
        System.out.println("2--微信");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ChatFactory chatFactory=new ChatFactory();
        ChatTool chatTool=chatFactory.getTool(n);
        chatTool.login();
        chatTool.send();
        chatTool.exit();
    }
}
