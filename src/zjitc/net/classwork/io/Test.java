package zjitc.net.classwork.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author admin
 * @Date 2019/4/9 16:11
 * 用Java代码实现，在当前目录创建一个example.txt文件，往example.txt文件写入“我爱Java！”，在磁盘上查看是否写入成功。
 * 然后通过Java代码查看example.txt文件内容。
 * 继续往该文件追加内容“我真的爱Java”，并查看文件内容。
 */
public class Test {
    public static void main(String[] args) {
        /*键盘输入内容保存在文件中，读取文件中的内容显示在控制台*/
        System.out.println("输入");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
   /*     将s保存在磁盘文件中*/
        try {
            /*加了true，追加，就不会覆盖原文件了*/
            FileOutputStream fos=new FileOutputStream("example.txt",true);
         /*   将字符串转换成字节数组getBytes()*/
            fos.write(s.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*读取文件example.exe中的数据到控制台*/
        FileInputStream fis;
        try {
            fis=new FileInputStream("example.txt");
            /*读取字节，显示无意义
            * 若是针对文本的操作，一般字符流
            * 图片、视频的话，用字节流，但是不会显示在控制台*/
            while (fis.read()!=-1){
                System.out.println(fis.read());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
