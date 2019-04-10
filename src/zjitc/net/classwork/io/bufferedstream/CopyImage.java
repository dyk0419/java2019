package zjitc.net.classwork.io.bufferedstream;


import java.io.*;

/**
 * @Author admin
 * @Date 2019/4/10 10:13
 */
public class CopyImage {
    public static void main(String[] args) {
        InputStream in = null;
        BufferedInputStream bis = null;


        BufferedOutputStream bos = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("D:\\kaola.jpg");
            bis = new BufferedInputStream(in);

            out = new FileOutputStream("kaola.jpg");
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
                if (bos != null) {
                    bos.close();
                }
                if (out != null) {
                    out.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (in != null) {
                    in.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
