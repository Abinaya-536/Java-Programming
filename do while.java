import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        while (true) {
            System.out.print("Enter number (0 to stop): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Count: " + count);
    }
}
