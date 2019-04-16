package zjitc.net.classwork.summary.user;

import java.util.Objects;

/**
 * @Author admin
 * @Date 2019/4/16 14:10
 */
public class User {
    String username;
    String Psaaword;
    String email;


    public User() {
    }

    public User(String username, String psaaword, String email) {
        this.username = username;
        Psaaword = psaaword;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsaaword() {
        return Psaaword;
    }

    public void setPsaaword(String psaaword) {
        Psaaword = psaaword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(Psaaword, user.Psaaword) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, Psaaword, email);
    }
}
