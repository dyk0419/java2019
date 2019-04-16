package zjitc.net.homework.homework9.ktyio;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author admin
 * @Date 2019/4/3 8:14
 */
public class SongDaolmp implements SongDao {
    ArrayList<Song> arrayList = new ArrayList<Song>();

    @Override
    public void init() {
        Song song1 = new Song("夜曲");
        Song song2 = new Song("稻香");
        Song song3 = new Song("快乐的小青蛙");
        Song song4 = new Song("小幸运");
        arrayList.add(song1);
        arrayList.add(song2);
        arrayList.add(song3);
        arrayList.add(song4);
        System.out.print("初始化歌曲列表：");
        Writer out = null;
        BufferedWriter bw = null;
        try {
            out = new FileWriter("ktv.txt", true);
            bw = new BufferedWriter(out);
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i));
                bw.write(String.valueOf(arrayList.get(i)));
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
    }

    @Override
    public void add(Song song) {
        arrayList.add(song);
        Writer out = null;
        BufferedWriter bw = null;
        try {
            out = new FileWriter("ktv.txt", true);
             bw = new BufferedWriter(out);
            bw.write(song.getName());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println("已添加歌曲：" + song.getName());
    }

    @Override
    public void all() {
        System.out.println("当前歌曲列表：");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            System.out.print(song.getName() + "\t");
        }
        System.out.println();
    }

    @Override
    public void top(String name) {
        /*调用方法完成判断是否存在该歌曲*/
        Song song = select(name);
        if (song == null) {
            System.out.println("当前歌曲列表没有此歌曲");
        } else {
            /*1)找到歌曲名对应的歌曲对象
             * 列表中删除该对象
             * 将对象添加到列表的第一项*/
            arrayList.remove(song);
            arrayList.add(0, song);
            System.out.println("已将歌曲" + song.getName() + "置顶");
        }
    }

    @Override
    public Song select(String name) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                return arrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public void before(Song music) {

        int n = arrayList.indexOf(music);
        /*先删除后添加*/
        arrayList.remove(music);
        arrayList.add(n - 1, music);
    }
}
