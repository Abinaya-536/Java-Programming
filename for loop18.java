import java.util.Scanner;

public class WeatherAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalTemp = 0;
        double highestTemp = -999;
        double lowestTemp = 999;

        int highestHour = 0;
        int lowestHour = 0;

        int hotCount = 0;
        int coldCount = 0;

        for (int i = 0; i < n; i++) {

            int hour = sc.nextInt();
            double temp = sc.nextDouble();

            String status;

            if (temp > 40 || temp < 0) {
                status = "Extreme";
            } 
            else if (temp >= 32) {
                status = "Hot";
            } 
            else if (temp <= 10) {
                status = "Cold";
            } 
            else {
                status = "Normal";
            }

            if (temp >= 32) {
                hotCount++;
            }

            if (temp <= 10) {
                coldCount++;
            }

            if (temp > highestTemp) {
                highestTemp = temp;
                highestHour = hour;
            }

            if (temp < lowestTemp) {
                lowestTemp = temp;
                lowestHour = hour;
            }

            totalTemp += temp;

            System.out.println("Hour " + hour + ": " + temp + "°C");
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avg = totalTemp / n;

        System.out.println("Total Readings: " + n);
        System.out.println("Average Temperature: " + avg + "°C");
        System.out.println("Highest Temperature: " + highestTemp + "°C at Hour " + highestHour);
        System.out.println("Lowest Temperature: " + lowestTemp + "°C at Hour " + lowestHour);
        System.out.println("Hot Hours: " + hotCount);
        System.out.println("Cold Hours: " + coldCount);
    }
}
