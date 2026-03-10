import java.util.Scanner;

public class loop12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalRevenue = 0;
        int peakVehicles = 0;

        for(int i = 1; i <= n; i++)
        {
            String vehicleType = sc.next();
            double hours = sc.nextDouble();

            double rate = 0;
            double cap = 0;

            if(vehicleType.equals("Car"))
            {
                rate = 3.0;
                cap = 30.0;
            }
            else if(vehicleType.equals("Motorcycle"))
            {
                rate = 2.0;
                cap = 20.0;
            }
            else if(vehicleType.equals("Truck"))
            {
                rate = 5.0;
                cap = 60.0;
            }
            else if(vehicleType.equals("Bus"))
            {
                rate = 7.0;
                cap = 100.0;
            }

            double fee = hours * rate;
            boolean capApplied = false;

            if(fee > cap)
            {
                fee = cap;
                capApplied = true;
            }

            if(hours > 8)
                peakVehicles++;

            totalRevenue += fee;

            System.out.println("Vehicle " + i + ": " + vehicleType);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + fee);

            if(capApplied)
                System.out.println("Cap Applied: Yes");
            else
                System.out.println("Cap Applied: No");

            System.out.println();
        }

        double averageFee = totalRevenue / n;

        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fee: $" + averageFee);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakVehicles);
    }
}
