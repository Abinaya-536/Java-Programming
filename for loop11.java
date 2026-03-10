import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double originalTotal = 0;
        double finalTotal = 0;

        for(int i = 1; i <= n; i++)
        {
            String seatType = sc.next();
            String customerType = sc.next();

            double basePrice = 0;
            int discount = 0;

            if(seatType.equals("Regular"))
                basePrice = 12.0;
            else if(seatType.equals("Premium"))
                basePrice = 18.0;
            else if(seatType.equals("Recliner"))
                basePrice = 25.0;

            if(customerType.equals("Child"))
                discount = 30;
            else if(customerType.equals("Senior"))
                discount = 25;
            else
                discount = 0;

            double finalPrice = basePrice - (basePrice * discount / 100);

            originalTotal += basePrice;
            finalTotal += finalPrice;

            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + finalPrice);
            System.out.println();
        }

        boolean groupDiscount = false;

        if(n >= 5)
        {
            finalTotal = finalTotal - (finalTotal * 0.10);
            groupDiscount = true;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);

        if(groupDiscount)
            System.out.println("Group Discount Applied: Yes");
        else
            System.out.println("Group Discount Applied: No");
    }
}
