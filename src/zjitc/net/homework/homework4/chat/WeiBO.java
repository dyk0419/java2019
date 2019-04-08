package zjitc.net.homework.homework4.chat;

/**
 * @author 杜源康
 * @date 2019-03-21 10:26
 */
public class WeiBO extends ChatTool {
    public void fans() {
        System.out.println("求粉");
    }

    public void weibo() {
        System.out.println("Weibo");
    }

    @Override
    public void send() {
        fans();
        weibo();
        super.send();
    }

    @Override
    public void login() {
        weibo();
        super.login();
    }

    @Override
    public void exit() {
        weibo();
        super.exit();
    }
}
