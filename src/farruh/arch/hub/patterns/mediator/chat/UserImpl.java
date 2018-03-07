package farruh.arch.hub.patterns.mediator.chat;

public class UserImpl extends User{
    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    void send(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        mediator.messageMessage(msg,this);
    }

    @Override
    void recieve(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
