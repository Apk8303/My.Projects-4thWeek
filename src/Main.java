import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    final static AuthorService authorService = new AuthorService();
    final static Article articleService = new Article();

    public static void main(String[] args) {
        System.out.println("Welcome to TSE..\n\n");


        while (true) {
            System.out.println("1.Signup");
            System.out.println("2.login");
            int userInput = scanner.nextInt();

            userLoginMenu(userInput);


        }
    }


    public static void userLoginMenu(int option) {

        switch (option) {

            case 1:
                System.out.println("Enter firstname:");
                String firstname = scanner.next();
                System.out.println("Enter lastname:");
                String lastname = scanner.next();
                System.out.println("Enter username:");
                String username = scanner.next();
                System.out.println("Enter password:");
                String password = scanner.next();


            case 2:
        }
    }


    public static void loginMenu() {
        // login related logic...
    }

    public static void chargeBalanceMenu() {
        Author currentLoggedInAuthor = AuthenticationService.getLoggedInAuthor();
    }
}