package zjitc.net.classwork.io.bufferedreader;

import java.io.*;

/**
 * @Author admin
 * @Date 2019/4/10 11:13
 * 将d盘文件拷贝到当前目录
 */
public class CopyFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        Reader in = null;

        BufferedWriter bw = null;
        Writer out = null;

        try {
            in = new FileReader("D:\\test.txt");
            br = new BufferedReader(in);

            out = new FileWriter("reader.txt");
            bw = new BufferedWriter(out);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            /*输出结束的时候才刷新*/
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
