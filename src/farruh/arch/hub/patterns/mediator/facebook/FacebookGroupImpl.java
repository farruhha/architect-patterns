package farruh.arch.hub.patterns.mediator.facebook;

import java.util.ArrayList;
import java.util.List;

public class FacebookGroupImpl implements FacebookGroupMediator {
    private List<User> userList;


    public FacebookGroupImpl() {
        userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User us : this.userList) {

            if (us != user) {
                us.recieve(msg);
            }
        }
    }

    @Override
    public void registerUser(User user) {
        this.userList.add(user);
    }
}
