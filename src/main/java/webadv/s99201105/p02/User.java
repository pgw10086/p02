package webadv.s99201105.p02;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
