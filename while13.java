import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        int result = 1;

        while (exponent > 0) {
            result = result * base;
            exponent--;
        }

        System.out.println(base + "^" + exponent + " = " + result);
    }
}
