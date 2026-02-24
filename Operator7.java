import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cart = sc.nextInt();
        int premium = sc.nextInt(); 
        if (cart > 999 || premium == 1) {
            System.out.println("Free Shipping");
        } else {
            System.out.println("Shipping Charges Applied");
        }

        sc.close();
    }
}