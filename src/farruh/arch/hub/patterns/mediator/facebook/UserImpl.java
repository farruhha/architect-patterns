package farruh.arch.hub.patterns.mediator.facebook;

public class UserImpl extends User {

    public UserImpl(FacebookGroupMediator facebookGroupMediator, String name) {
        super(facebookGroupMediator, name);

    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " is sending message " + msg);
        facebookGroupMediator.sendMessage(msg, this);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.name + " Received a message " + msg);
    }
}
