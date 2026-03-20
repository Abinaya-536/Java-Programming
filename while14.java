import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int original = number;
        int count = 0;

        // Count digits
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        int sum = 0;
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            int i = 0;
            while (i < count) {
                power *= digit;
                i++;
            }

            sum += power;
            temp /= 10;
        }

        // Check result
        if (sum == original) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
