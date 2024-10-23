

public class AuthenticationService {
    private static Author loggedInAuthor;

    public static void setLoggedInAuthor(Author author) {
        loggedInAuthor = author;
    }

    public static void logout() {
        loggedInAuthor = null;
    }

    public static Author getLoggedInAuthor() {
        return loggedInAuthor;
    }

}
