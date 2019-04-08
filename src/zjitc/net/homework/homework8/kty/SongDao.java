package zjitc.net.homework.homework8.kty;

/**
 * @Author admin
 * @Date 2019/4/3 9:01
 */
public interface SongDao {
    void init();

    void add(Song song);

    void all();

    void top(String name);

    Song select(String name);

    void before(Song music);
}
