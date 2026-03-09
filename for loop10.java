import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalItems = 0;
        double subtotal = 0;

        for(int i = 1; i <= n; i++)
        {
            String item = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            double itemTotal = price * qty;

            System.out.println("Item: " + item);
            System.out.println("Price: $" + price + " x " + qty);
            System.out.println("Subtotal: $" + itemTotal);
            System.out.println();

            subtotal += itemTotal;
            totalItems += qty;
        }

        double tax = subtotal * 0.08;
        double service = subtotal * 0.10;
        double grandTotal = subtotal + tax + service;

        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Service Charge (10%): $" + service);
        System.out.println("Grand Total: $" + grandTotal);

        sc.close();
    }
}
