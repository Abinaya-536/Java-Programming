import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Enter number (0 to stop):");
        int num = sc.nextInt();

        while (num != 0) {

            sum = sum + num;
            count++;

            System.out.println("Enter number (0 to stop):");
            num = sc.nextInt();
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Count: " + count);

    }
}
