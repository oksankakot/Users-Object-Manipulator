package app;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UsersManipulator {

    public Optional<User> findUserById(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    public Optional<User> findUserByEmail(List<User> users, String email) {
        return users.stream()
                .filter(user -> Objects.equals(user.getEmail(), email))
                .findFirst();
    }

    public Optional<List<User>> findAllUsers(List<User> users) {
        return Optional.of(users.stream().toList());
    }
}
