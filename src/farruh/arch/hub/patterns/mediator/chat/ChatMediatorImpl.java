package farruh.arch.hub.patterns.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> userList;

    public ChatMediatorImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void messageMessage(String msg, User user) {
        for (User usr : userList) {
            if (user != usr) {
                user.recieve(msg);
            }
        }
    }

    @Override
    public void receive(User user) {
        userList.add(user);
    }


}
