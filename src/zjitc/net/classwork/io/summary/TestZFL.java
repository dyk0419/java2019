package zjitc.net.classwork.io.summary;

import java.io.*;

/**
 * @Author admin
 * @Date 2019/4/12 8:08
 * 字符缓冲流：文本文件
 * 一行读写一个文本
 * 把当前目录下的1.txt拷贝到D盘
 */
public class TestZFL {
    public static void main(String[] args) {
        /*1.创建字符缓冲流对象
        * 2.循环操作
        *   读取源文件一行文本，写入目标文件
        * 3.刷新
        * 4.关闭流*/


/*      读取：输入流
        Reader in= new FileReader("homework9.1.txt");
        BufferedReader br=new BufferedReader(in);*/


/*      写入：输出流
        Writer out =new FileWriter("D\\1.txt");
        BufferedWriter bw=new BufferedWriter(out);*/

        Reader in= null;
        BufferedReader br=null;


        Writer out =null;
        BufferedWriter bw=null;
        try {
            in = new FileReader("homework9.1.txt");
            br=new BufferedReader(in);

            out =new FileWriter("D:\\1.txt");
            bw=new BufferedWriter(out);


            String line=null;
            while ((line=br.readLine())!=null){
                bw.write(line);
                /*newLine换行符*/
                bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (in != null) {
                    in.close();
                }
                if (bw != null) {
                    bw.close();
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
