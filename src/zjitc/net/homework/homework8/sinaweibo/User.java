package zjitc.net.homework.homework8.sinaweibo;

import java.util.Objects;

/**
 * @author 杜源康
 * @date 2019-04-08 17:17
 */
public class User {
    String username;
    String psaaword;
    String passwordenter;
    String phonenumber;
    String email;

    public User() {
    }

    public User(String username, String psaaword, String phonenumber, String email) {
        this.username = username;
        this.psaaword = psaaword;

        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsaaword() {
        return psaaword;
    }

    public void setPsaaword(String psaaword) {
        this.psaaword = psaaword;
    }

    public String getPasswordenter() {
        return passwordenter;
    }

    public void setPasswordenter(String passwordenter) {
        this.passwordenter = passwordenter;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
