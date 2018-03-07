package farruh.arch.hub.patterns.mediator.chat;

public interface ChatMediator {

    // This interface will provide the contract for concrete mediators
     void messageMessage(String msg, User user);

    void receive(User user);
}
