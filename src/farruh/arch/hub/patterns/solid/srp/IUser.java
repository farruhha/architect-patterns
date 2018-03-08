package farruh.arch.hub.patterns.solid.srp;

public interface IUser {

    boolean login(String username, String password);

    boolean register(String username, String password, String email);

}
