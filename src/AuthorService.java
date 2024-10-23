
public class AuthorService {

    public void userSignup(String firstName,
                           String lastName,
                           String username,
                           String password) {

        // Create user
        Author signingAuthor = new Author();
        signingAuthor.setFirstName(firstName);
        signingAuthor.setLastName(lastName);
        signingAuthor.setUsername(username);
        signingAuthor.setPassword(password);

        // Save to database
        Database.authorList.add(signingAuthor);
    }


    public void authorLogin(String username,
                          String password) {

        // Find the user from database:
        for (Author checkingAuthor: Database.authorList) {

            // First find user with username
            if (checkingAuthor.getUsername().equals(username)) {

                // Check password
                if (checkingAuthor.getPassword().equals(password)) {

                    // Set the logged User
                    AuthenticationService.setLoggedInAuthor(checkingAuthor);

                    System.out.println("User logged in successfully..");
                    return;
                }
            }
        }
        System.out.println("Username or password is wrong!");
    }


}
