package zjitc.net.homework.homework4.chat;

/**
 * @author 杜源康
 * @date 2019-03-21 10:26
 */
public class WeiXin extends ChatTool {
    public void shake() {
        System.out.println("WeiXin摇一摇");
    }

    public void weixin() {
        System.out.println("WeiXin");
    }

    @Override
    public void send() {
        shake();
        weixin();
        super.send();
    }

    @Override
    public void login() {
        weixin();
        super.login();
    }

    @Override
    public void exit() {
        weixin();
        super.exit();
    }
}
