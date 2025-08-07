
import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // constructor to initialize the user list with default user
    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }

    // signup -> add new user if username isn't taken
    @Override
    public User signUp(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return null; // username already exists
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // login -> return user if creds match
    @Override
    public User logIn(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) &&
            user.getPassword().equals(password)) {
                return user;
            }
        }

        return null; // no match found
    }
}
