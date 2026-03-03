import java.util.Scanner;

public class con8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String loc = sc.nextLine();
        int sqft = sc.nextInt();
        int age = sc.nextInt();
        int score = sc.nextInt();

        double pricePerSqft = 0;
        double agePercent = 0;
        double bonusPercent = 0;

        
        if (loc.equals("Prime")) {
            pricePerSqft = 400;
        } 
        else if (loc.equals("Urban")) {
            pricePerSqft = 300;
        } 
        else if (loc.equals("Suburban")) {
            pricePerSqft = 180;
        } 
        else if (loc.equals("Rural")) {
            pricePerSqft = 100;
        }

    
        if (age >= 0 && age <= 5) {
            agePercent = 0;
        } 
        else if (age >= 6 && age <= 15) {
            agePercent = -5;
            if (age > 10) {
                agePercent = -10;
            }
        } 
        else if (age >= 16 && age <= 30) {
            agePercent = -15;
            if (age > 20) {
                agePercent = -20;
            }
        } 
        else {
            agePercent = -25;
            if (age > 50) {
                agePercent = -35;
            }
        }

       
        if (score >= 80) {
            bonusPercent = 10;
        } 
        else if (score >= 60) {
            bonusPercent = 5;
        } 
        else if (score >= 40) {
            bonusPercent = 2;
        } 
        else {
            bonusPercent = 0;
        }

        double baseValue = sqft * pricePerSqft;
        double adjustedValue = baseValue + (baseValue * agePercent / 100);
        double bonus = adjustedValue * bonusPercent / 100;
        double finalValue = adjustedValue + bonus;

        String market;

        
        if ((loc.equals("Prime") || loc.equals("Urban")) && age < 15) {
            market = "Hot";
        } 
        else if (loc.equals("Suburban")) {
            market = "Stable";
        } 
        else {
            market = "Slow";
        }

               System.out.println("Location Tier: " + loc);
        System.out.println("Square Footage: " + sqft + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + score);
        System.out.println("Base Price Per Sq Ft: $" + pricePerSqft);
        System.out.println("Age Adjustment: " + agePercent + "%");
        System.out.println("Amenity Bonus: $" + bonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + market);

        sc.close();
    }
}
