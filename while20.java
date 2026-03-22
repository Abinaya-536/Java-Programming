import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;

            // Find factorial of digit
            int fact = 1;
            int i = 1;

            while (i <= digit) {
                fact = fact * i;
                i++;
            }

            sum = sum + fact;
            number = number / 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is a strong number");
        } else {
            System.out.println(temp + " is not a strong number");
        }
    }
}
