package zjitc.net.classwork.io.summary;

import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author admin
 * @Date 2019/4/12 9:03
 * 转换流：解决乱码问题
 * 将D盘1.txt（有中文）拷贝到当前目录
 */
public class TestZHL {
    public static void main(String[] args) {
        /* 1.创建转换流对象（注意一下编码格式）
         *  ANSI-------GBK
         * 2.用转换流对象去构造字符缓冲流
         * 3.循环操作
         *   读取源文件一行文本，写入目标文件
         * 4.刷新
         * 5.关闭流 */


        /*转换流构造方法需要传递2个参数
         * 基本字节流、编码格式*/
        InputStream in = null;
        try {
            in = new FileInputStream("D:\\1.txt");
            InputStreamReader isr = new InputStreamReader(in,"UTF-8" );
            BufferedReader br = new BufferedReader(isr);


            OutputStream out = new FileOutputStream("D:\\2.txt");
            OutputStreamWriter ose = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(ose);



            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }/*这里还没写关闭流*/

    }
}
