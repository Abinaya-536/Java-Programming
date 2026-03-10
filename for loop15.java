import java.util.Scanner;

public class loop15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalDistance = 0;
        double totalRevenue = 0;

        for(int i = 1; i <= n; i++)
        {
            double distance = sc.nextDouble();
            String time = sc.next();

            double baseFare = 3.0;
            double distanceCharge = distance * 1.0;
            double surcharge = 0;

            if(time.equals("Evening"))
                surcharge = 3.0;
            else if(time.equals("Night"))
                surcharge = 5.0;
            else
                surcharge = 0.0;

            double totalFare = baseFare + distanceCharge + surcharge;

            totalDistance += distance;
            totalRevenue += totalFare;

            System.out.println("Ride " + i);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Time: " + time);
            System.out.println("Base Fare: $" + baseFare);
            System.out.println("Distance Charge: $" + distanceCharge);
            System.out.println("Time Surcharge: $" + surcharge);
            System.out.println("Total Fare: $" + totalFare);
            System.out.println();
        }

        double averageFare = totalRevenue / n;

        System.out.println("Total Rides: " + n);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fare: $" + averageFare);
    }
}
