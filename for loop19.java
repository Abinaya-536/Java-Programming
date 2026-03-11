import java.util.Scanner;

public class WarrantySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int active = 0;
        int expSoon = 0;
        int expired = 0;

        for (int i = 0; i < n; i++) {

            String id = sc.next();
            String type = sc.next();
            int used = sc.nextInt();

            int warranty = 0;

            if (type.equals("Electronics")) {
                warranty = 12;
            } 
            else if (type.equals("Appliance")) {
                warranty = 24;
            } 
            else if (type.equals("Computer")) {
                warranty = 36;
            }

            int remaining = warranty - used;

            if (remaining < 0) {
                remaining = 0;
            }

            String status;

            if (remaining == 0) {
                status = "Expired";
                expired++;
            } 
            else if (remaining <= 3) {
                status = "Expiring Soon";
                expSoon++;
            } 
            else {
                status = "Active";
                active++;
            }

            System.out.println("Product ID: " + id);
            System.out.println("Type: " + type);
            System.out.println("Warranty Period: " + warranty + " months");
            System.out.println("Months Used: " + used);
            System.out.println("Remaining: " + remaining + " months");
            System.out.println("Status: " + status);
            System.out.println();
        }

        System.out.println("Total Products: " + n);
        System.out.println("Active Warranties: " + active);
        System.out.println("Expiring Soon: " + expSoon);
        System.out.println("Expired Warranties: " + expired);
    }
}
