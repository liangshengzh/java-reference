package ch03;

/**
 * Created by zhonlian on 2016/4/20.
 */
public class User {
    private  String forName;
    private  String lastName;

    public User() {
    }

    public User(String forName, String lastName) {
        this.forName = forName;
        this.lastName = lastName;
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
