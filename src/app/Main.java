package app;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UsersManipulator manipulator = new UsersManipulator();
        List<User> users = repository.getAllUsers();

        System.out.println("Search user by ID #1.");
        Optional<User> userById = manipulator.findUserById(users, 1);
        userById.ifPresent(user -> System.out.println("Found: " + user.getName()));
        System.out.println("----------");

        System.out.println("Searching user by email.");
        Optional<User> userByEmail = manipulator.findUserByEmail(users, "it@gmail.com");
        userByEmail.ifPresent(user -> System.out.println("Found: " + user.getName()));
        System.out.println("----------");

        System.out.println("Retrieving list of all users.");
        Optional<List<User>> allUsers = manipulator.findAllUsers(users);
        allUsers.ifPresent(list -> System.out.println("Number of users in the list: " + list.size() + " users."));

    }
}
