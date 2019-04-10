package zjitc.net.classwork.io.bufferedstream;

import java.io.*;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/10 9:05
 * 创建字节缓冲流，通过缓冲流对象实现信息写入文件，以及读取文件内容
 */
public class Test {
    public static void main(String[] args) {
        /*1.接收用户键盘输入的内容
         * 2.通过字节缓冲流写入文件
         * 3.再读取文件内容显示在控制台*/
        System.out.println("输入");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        /*通过字节缓冲流写入对象
         * 1.创建缓冲流对象
         * 调用流对象的write方法*/
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            outputStream = new FileOutputStream("1.txt");
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            byte[] b = s.getBytes();


            /*将指定的字节写入此缓冲的输出流。*/
            bufferedOutputStream.write(b);

            /*刷新此缓冲的输出流。*/
            bufferedOutputStream.flush();


            /*通过字节缓冲流读取文件显示在控制台*/
            inputStream = new FileInputStream("1.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);
            int len = 0;
/*
            while ((len = bufferedInputStream.read()) != -1) {
                System.out.println(bufferedInputStream.read()); //一次读取一个字节
            }
*/
            byte[] b1 = new byte[1024];
            while ((len = bufferedInputStream.read()) != -1) {
                /*把读取出来的字节转成字符串*/
                System.out.println(new String(b1, 0, len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {   //必须关闭
            try {
                bufferedOutputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
