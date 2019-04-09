package zjitc.net.classwork.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author admin
 * @Date 2019/4/9 16:59
 * 将当前文件example.txt拷贝到D盘根目录
 * 读取源文件内容，写入目标文件
 */
public class CopyFile {
    public static void main(String[] args) {
        try {
            /*输入流：读取：读取的源文件*/
            FileInputStream fis=new FileInputStream("example.txt");
            /*输出流：写入：写入目标文件*/
            FileOutputStream fos=new FileOutputStream("D:\\a.txt",true);


            /*第一种：一次读取一个字节，写入一个字节到目标文件*/
            int len=0;
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
            /*第二种：一次读取一个字节数组*/






        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
