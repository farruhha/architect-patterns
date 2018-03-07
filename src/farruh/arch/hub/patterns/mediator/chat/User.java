package farruh.arch.hub.patterns.mediator.chat;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    //Notice that User has a reference to the mediator object, it’s required for the communication between different users.

    public User(ChatMediator chatMediator, String name) {
        this.mediator = chatMediator;
        this.name = name;
    }

    abstract void send(String msg);

    abstract void recieve(String msg);

}
