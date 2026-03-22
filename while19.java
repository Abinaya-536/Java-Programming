import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();
        int temp = decimal;
        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary; // build in reverse
            decimal = decimal / 2;
        }

        System.out.println("Decimal: " + temp);
        System.out.println("Binary: " + binary);
    }
}
