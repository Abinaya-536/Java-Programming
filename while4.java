import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        long result = 1;

        while (i <= n) {
            result = result * i;
            i++;
        }

        System.out.println("Factorial of " + n + " = " + result);
    }
}
