package zjitc.net.classwork.io.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author admin
 * @Date 2019/4/10 8:05
 */
public class CopyMp4 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos = null;
        try {
            /*输入流：读取：读取的源文件*/
            fis = new FileInputStream("D:\\1.mp4");



            /*输出流：写入：写入目标文件*/
            fos = new FileOutputStream("examplemp4.mp4", true);


            /*第一种：一次读取一个字节，写入一个字节到目标文件*/
/*            int len=0;
            long start=System.currentTimeMillis();
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
            long end=System.currentTimeMillis();
            System.out.println("一次读取一个字节："+(end-start)+"毫秒");*/
            /*第二种：一次读取一个字节数组*/
            byte[] bytes = new byte[1024];
            int len = 0;
            long start = System.currentTimeMillis();
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("一次读取一个字节：" + (end - start) + "毫秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            /*关闭流*/
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
