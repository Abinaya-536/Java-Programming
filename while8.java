import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        System.out.println("Number: " + number);

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
