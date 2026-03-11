import java.util.Scanner;

public class GymRenewalTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int urgentCount = 0;
        double totalRevenue = 0;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String type = sc.next();
            int days = sc.nextInt();

            double renewalFee = 0;
            double discount = 0;
            double finalFee;
            String priority;

            // Membership fee
            if (type.equals("Basic")) {
                renewalFee = 50;
            } 
            else if (type.equals("Premium")) {
                renewalFee = 100;
            } 
            else if (type.equals("VIP")) {
                renewalFee = 200;
            }

            // Discount calculation
            if (days >= 45) {
                discount = 20;
            } 
            else if (days >= 30) {
                discount = 15;
            } 
            else if (days >= 15) {
                discount = 10;
            } 
            else {
                discount = 0;
            }

            // Priority
            if (days < 10) {
                priority = "Urgent";
                urgentCount++;
            } 
            else if (days <= 30) {
                priority = "High";
            } 
            else {
                priority = "Normal";
            }

            finalFee = renewalFee * (1 - discount / 100);

            totalRevenue += finalFee;

            System.out.println("Member: " + name);
            System.out.println("Membership: " + type);
            System.out.println("Days Until Expiry: " + days);
            System.out.println("Renewal Fee: $" + renewalFee);
            System.out.println("Discount: " + (int)discount + "%");
            System.out.println("Final Fee: $" + finalFee);
            System.out.println("Priority: " + priority);
            System.out.println();
        }

        double avg = totalRevenue / n;

        System.out.println("Total Members: " + n);
        System.out.println("Urgent Renewals: " + urgentCount);
        System.out.println("Total Renewal Revenue: $" + totalRevenue);
        System.out.println("Average Renewal Fee: $" + avg);
    }
}
