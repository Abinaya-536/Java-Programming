import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        double maxRate = 0;
        int peakDay = 0;
        int full = 0;

        for(int i = 1; i <= n; i++) {

            int day = sc.nextInt();
            int occ = sc.nextInt();
            int total = sc.nextInt();

            double rate = (double)occ / total * 100;

            String status;

            if(rate < 60)
                status = "Low";
            else if(rate < 80)
                status = "Moderate";
            else if(rate < 100)
                status = "High";
            else
                status = "Full";

            if(rate == 100)
                full++;

            if(rate > maxRate) {
                maxRate = rate;
                peakDay = day;
            }

            sum = sum + rate;

            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + occ);
            System.out.println("Total Rooms: " + total);
            System.out.println("Occupancy Rate: " + rate + "%");
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avg = sum / n;

        System.out.println("Total Days Analyzed: " + n);
        System.out.println("Average Occupancy Rate: " + avg + "%");
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + full);
    }
}
