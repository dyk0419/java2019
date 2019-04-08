package zjitc.net.classwork.api.api2;

/**
 * @Author admin
 * @Date 2019/3/27 11:07
 */
public class RuntimeTest {
    public static void main(String[] args) {
// 创建一个Runtime实例对象
        Runtime rt = Runtime.getRuntime();
// 得到表示进程的Process对象
        Process process = null;
        try {
            process = rt.exec("notepad.exe");
// 程序休眠3秒
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
// 杀掉进程
        process.destroy();
    }
}
