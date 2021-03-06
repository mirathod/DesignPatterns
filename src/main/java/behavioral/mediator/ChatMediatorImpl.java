package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Milan Rathod
 */
public class ChatMediatorImpl implements ChatMediator {

    private final List<User> users;

    public ChatMediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receiver(message);
            }
        }
    }

    @Override
    public void registerUser(User user) {
        this.users.add(user);
    }

}
