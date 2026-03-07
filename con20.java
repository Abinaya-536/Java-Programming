import java.util.Scanner;

public class con20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storage = sc.nextInt();
        int users = sc.nextInt();
        sc.nextLine();

        String backup = sc.nextLine();
        String support = sc.nextLine();

        double storageCost = 0;
        double userFee = 0;
        double backupFee = 0;
        double supportFee = 0;

        String plan = "";
        String features = "";

       
        if(storage <= 100){
            storageCost = storage * 0.05;
        }
        else if(storage <= 500){
            storageCost = (100 * 0.05) + (storage - 100) * 0.04;
        }
        else if(storage <= 2000){
            storageCost = (100 * 0.05) + (400 * 0.04) + (storage - 500) * 0.03;
        }
        else{
            storageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + (storage - 2000) * 0.02;
        }

       
        if(users <= 10){
            userFee = users * 5;
        }
        else if(users <= 50){
            userFee = users * 4;
        }
        else{
            userFee = users * 3;
        }

        
        if(backup.equals("Daily")){
            backupFee = 0;
        }
        else if(backup.equals("Hourly")){
            backupFee = 15 + (users * 0.5);
        }
        else if(backup.equals("Real-Time")){
            backupFee = 50 + users;
        }

        // Support fee
        if(support.equals("Community")){
            supportFee = 0;
        }
        else if(support.equals("Standard")){
            supportFee = 20;
        }
        else if(support.equals("Priority")){
            supportFee = 75;
        }
        else if(support.equals("Enterprise")){
            supportFee = 200;
        }

        
        double monthly = storageCost + userFee + backupFee + supportFee;
        double yearly = monthly * 12 * 0.9;

        // Recommended plan
        if(users == 1){
            plan = "Personal";
            features = "Basic storage, file sync";
        }
        else if(users <= 20){
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        }
        else if(users <= 100){
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        }
        else{
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

       
        System.out.println("Storage Capacity: " + storage + " GB");
        System.out.println("User Count: " + users);
        System.out.println("Backup Frequency: " + backup);
        System.out.println("Support Tier: " + support);
        System.out.println("Base Storage Cost: $" + storageCost);
        System.out.println("Per-User Fee: $" + userFee);
        System.out.println("Backup Premium: $" + backupFee);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthly);
        System.out.println("Annual Subscription: $" + yearly + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);

    }
}
