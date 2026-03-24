import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int sum = 0;

        while (start <= end) {
            if (start % 2 == 0) {
                sum += start;
            }
            start++;
        }

        System.out.println("Sum of even numbers from " + (start - (end - start + 1)) + " to " + end + ": " + sum);

        sc.close();
    }
}
