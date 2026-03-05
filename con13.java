import java.util.Scanner;

public class con13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String status = sc.nextLine();      
        int creditHours = sc.nextInt();
        sc.nextLine();                    
        String program = sc.nextLine();     
        String residency = sc.nextLine();  

        double baseTuition = 0;
        double multiplier = 1.0;
        double programFee = 0;
        double activityFee = 0;

        
        if (program.equals("Undergraduate"))
            baseTuition = 350;
        else if (program.equals("Graduate"))
            baseTuition = 550;
        else
            baseTuition = 800;

        
        if (residency.equals("In-State"))
            multiplier = 1.0;
        else if (residency.equals("Out-of-State"))
            multiplier = 2.5;
        else
            multiplier = 3.0;

        
        if (status.equals("Full-Time")) {

            if (program.equals("Undergraduate"))
                programFee = 500;
            else if (program.equals("Graduate"))
                programFee = 750;
            else
                programFee = 1200;

        } 
        else if (status.equals("Part-Time")) {

            if (program.equals("Undergraduate"))
                programFee = 300;
            else if (program.equals("Graduate"))
                programFee = 750;
            else
                programFee = 900;

        } 
        else {   
            programFee = 150;
        }

      
        if (status.equals("Full-Time"))
            activityFee = 200;
        else if (status.equals("Part-Time"))
            activityFee = 100;
        else
            activityFee = 50;


        double tuitionCost = creditHours * baseTuition * multiplier;
        double totalFee = tuitionCost + programFee + activityFee;

        
        String category;

        if (status.equals("Continuing-Education"))
            category = "Reduced";
        else if (residency.equals("In-State"))
            category = "Standard";
        else
            category = "Premium";


        System.out.println("Student Status: " + status);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Program Type: " + program);
        System.out.println("Residency: " + residency);
        System.out.println("Base Tuition Per Credit: $" + baseTuition);
        System.out.println("Residency Multiplier: " + multiplier + "x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Registration Fee: $" + totalFee);
        System.out.println("Fee Category: " + category);

    }
}
