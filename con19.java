import java.util.Scanner;

public class con19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String format = sc.nextLine();
        String time = sc.nextLine();
        String seat = sc.nextLine();
        String type = sc.nextLine();

        double base = 12.0;
        double f = 0;
        double s = 0;
        int t = 0;
        int d = 0;

       
        if(format.equals("2D"))
            f = 0;
        else if(format.equals("3D"))
            f = 5;
        else if(format.equals("IMAX"))
            f = 8;
        else if(format.equals("4DX"))
            f = 10;

       
        if(seat.equals("Standard"))
            s = 0;
        else if(seat.equals("Premium"))
            s = 4;
        else if(seat.equals("Recliner"))
            s = 7;

        
        if(time.equals("Matinee"))
            t = -30;
        else if(time.equals("Evening"))
            t = 0;
        else if(time.equals("Prime-Time"))
            t = 20;
        else if(time.equals("Late-Night"))
            t = -20;

       
        if(type.equals("Adult"))
            d = 0;
        else if(type.equals("Senior"))
            d = 25;
        else if(type.equals("Student"))
            d = 15;
        else if(type.equals("Child"))
            d = 30;

        double price = base + f + s;
        double price2 = price * (1 + t/100.0);
        double finalPrice = price2 * (1 - d/100.0);

        
        String v;
        if(time.equals("Matinee") || type.equals("Senior") || type.equals("Student") || type.equals("Child"))
            v = "Yes";
        else
            v = "No";

        
        String c;
        if(finalPrice <= 10)
            c = "Value";
        else if(finalPrice <= 20)
            c = "Standard";
        else if(finalPrice <= 30)
            c = "Premium";
        else
            c = "Luxury";

        System.out.println("Movie Format: " + format);
        System.out.println("Show Time: " + time);
        System.out.println("Seat Category: " + seat);
        System.out.println("Customer Type: " + type);
        System.out.println("Base Ticket Price: $" + base);
        System.out.println("Format Surcharge: $" + f);
        System.out.println("Seat Upgrade Fee: $" + s);
        System.out.println("Time-Based Adjustment: " + t + "%");
        System.out.println("Customer Discount: " + d + "%");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Concession Voucher: " + v);
        System.out.println("Pricing Category: " + c);
    }
}
