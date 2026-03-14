import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;

                    case 4:
                        System.out.println("Result: " + (a / b));
                        break;
                }
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}
