import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        double power = sc.nextDouble();
        double renewable = sc.nextDouble();
        sc.nextLine();
        String tier = sc.nextLine();

        double base = 0;
        double multi = 1;
        String msg = "";
        double save = 0;

     
        if (tier.equals("Basic")) {
            base = 0.18;
        } 
        else if (tier.equals("Time-of-Use")) {
            base = 0.15;
        } 
        else if (tier.equals("Premium-Green")) {
            base = 0.12;
        }

      
        if (time.equals("Peak")) {
            if (tier.equals("Time-of-Use"))
                multi = 1.8;
            else if (tier.equals("Premium-Green"))
                multi = 1.5;
            else
                multi = 1.0;
        } 
        else if (time.equals("Off-Peak")) {
            if (tier.equals("Time-of-Use"))
                multi = 0.8;
            else
                multi = 1.0;
        } 
        else if (time.equals("Super-Off-Peak")) {
            if (tier.equals("Premium-Green"))
                multi = 0.6;
            else
                multi = 0.5;
        }

       
        double credit = (power * renewable / 100) * base;

       
        double cost = (power * base * multi) - credit;
        if (cost < 0)
            cost = 0;

       
        if (time.equals("Peak") && renewable < 30) {
            msg = "Shift high-power appliances to Off-Peak hours";
            save = power * base * (multi - 0.8);
        } 
        else if (renewable >= 60) {
            msg = "Excellent! Maximize appliance use during this period";
            save = 0;
        } 
        else if (tier.equals("Basic") && power > 20) {
            msg = "Consider upgrading to Time-of-Use plan";
            save = power * 0.03;
        } 
        else {
            msg = "Good timing! Consider increasing renewable capacity";
            save = 0;
        }

     
        System.out.println("Time of Day: " + time);
        System.out.println("Power Consumption: " + power + " kWh");
        System.out.println("Renewable Energy: " + renewable + "%");
        System.out.println("Rate Tier: " + tier);
        System.out.println("Base Rate: $" + base + "/kWh");
        System.out.println("Rate Multiplier: " + multi + "x");
        System.out.printf("Renewable Credit: $%.2f\n", credit);
        System.out.printf("Total Cost: $%.2f\n", cost);
        System.out.println("Optimization Recommendation: " + msg);
        System.out.printf("Potential Savings: $%.2f", save);

        sc.close();
    }
}
