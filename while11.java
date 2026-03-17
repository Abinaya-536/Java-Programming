import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " = " + a);
    }
}
