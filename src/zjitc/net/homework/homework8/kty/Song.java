package zjitc.net.homework.homework8.kty;

/**
 * @Author admin
 * @Date 2019/4/3 8:11
 */
public class Song {
    private String name;

    public Song() {
    }

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"\t";
    }
}
