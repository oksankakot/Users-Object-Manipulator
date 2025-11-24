package app;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Peter", "peter_pen@gmail.com"));
        users.add(new User(2, "Pennywise", "it@gmail.com"));
        users.add(new User(3, "Xenomorph", "alien@xfiles.com"));

        return users;

    }
}
