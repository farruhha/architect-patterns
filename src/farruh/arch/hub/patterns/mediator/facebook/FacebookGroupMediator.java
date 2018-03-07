package farruh.arch.hub.patterns.mediator.facebook;

public interface FacebookGroupMediator {

    void sendMessage(String msg, User user);

    void registerUser(User user);
}
