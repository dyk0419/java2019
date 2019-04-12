package zjitc.net.classwork.io.summary;

import java.io.*;

/**
 * @Author admin
 * @Date 2019/4/12 8:08
 * 字节缓冲流：图片、视频等
 * 一次读取一个字节数组
 * 将当前目录下的kaola.jpg拷贝到D盘
 */
public class TestZJL {
    public static void main(String[] args) {
        /*1.创建字节缓冲流对象
         * 2.循环操作：
         * 读取源文件一个字节数组，写入目标文件
         * 3.刷新
         * 4.关闭流*/

        /*读取，输入流，input
        * InputStream in=new FileInputStream("kaola.jpg");
          BufferedInputStream bis=new BufferedInputStream(in);*/


        /*写入：输出流，output
   *    OutputStream out=new FileOutputStream("D:\\kaola.jpg");
        BufferedOutputStream bos=new BufferedOutputStream(out);*/


        InputStream in = null;
        BufferedInputStream bis = null;

        OutputStream out = null;
        BufferedOutputStream bos = null;


        try {
            in = new FileInputStream("kaola.jpg");
            bis = new BufferedInputStream(in);

            out = new FileOutputStream("D:\\kaola.jpg");
            bos = new BufferedOutputStream(out);

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

            bos.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bis != null) {
                    bis.close();
                }
                if (in != null) {
                    in.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
