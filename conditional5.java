import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bookingClass = sc.nextLine();
        int days = sc.nextInt();
        double availability = sc.nextDouble();
        sc.nextLine();
        String route = sc.nextLine();

        double basePrice = 0.0;
        double multiplier = 1.0;
        double finalPrice = 0.0;
        String category = "";

    
        if (bookingClass.equals("Economy")) {
            if (route.equals("Domestic")) {
                basePrice = 200.0;
            } else if (route.equals("International-Short")) {
                basePrice = 500.0;
            } else if (route.equals("International-Long")) {
                basePrice = 800.0;
            }
        } 
        else if (bookingClass.equals("Business")) {
            if (route.equals("Domestic")) {
                basePrice = 600.0;
            } else if (route.equals("International-Short")) {
                basePrice = 1500.0;
            } else if (route.equals("International-Long")) {
                basePrice = 2500.0;
            }
        } 
        else if (bookingClass.equals("First")) {
            if (route.equals("Domestic")) {
                basePrice = 1000.0;
            } else if (route.equals("International-Short")) {
                basePrice = 3000.0;
            } else if (route.equals("International-Long")) {
                basePrice = 5000.0;
            }
        }

            if (availability < 30 && days < 14) {
            multiplier = 1.8;
            category = "High Demand";
        } 
        else if (availability < 50 && days < 30) {
            multiplier = 1.5;
            category = "High Demand";
        } 
        else if (availability >= 60 && days > 60) {
            multiplier = 0.8;
            category = "Low Demand";
        } 
        else if (availability < 60 || (days >= 30 && days <= 60)) {
            multiplier = 1.0;
            category = "Moderate";
        } 
        else {
            multiplier = 1.3;
            category = "Moderate";
        }

      
        finalPrice = basePrice * multiplier;


        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + days);
        System.out.println("Seat Availability: " + availability + "%");
        System.out.println("Route Type: " + route);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Demand Multiplier: " + multiplier + "x");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Pricing Category: " + category);

        sc.close();
    }
}