package farruh.arch.hub.patterns.mediator.chat;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.receive(user1);
        mediator.receive(user2);
        mediator.receive(user3);
        mediator.receive(user4);

        user1.send("Hi All");

    }

   // Notice that client program is very simple and it has no idea how the message is getting handled and if mediator is getting user or not.

}