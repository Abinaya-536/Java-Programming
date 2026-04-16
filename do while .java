import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = sc.nextLine();
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter password:");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Account locked!");
                } else {
                    System.out.println("Incorrect! Attempts remaining: " + attempts);
                }
            }
        }
    }
}
