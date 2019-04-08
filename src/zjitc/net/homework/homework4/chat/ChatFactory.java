package zjitc.net.homework.homework4.chat;

/**
 * @author 杜源康
 * @date 2019-03-21 10:27
 */
public class ChatFactory {
    public ChatTool getTool(int n){
        if (n==1){
            return new WeiBO();
        }else if (n==2){
            return new WeiXin();
        }else{
            return null;
        }
    }
}
