package farruh.arch.hub.patterns.proxy.protect;

public class User {

    private String username;
    private String password;
    private String designation;


    public User(String username, String password, String designation){
        this.username  = username;
        this.password = password;
        this.designation = designation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
