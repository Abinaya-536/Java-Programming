import java.util.Scanner;

public class con18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        sc.nextLine();
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0;
        double weightCharge = weight * 1;
        double zoneMul = 1;
        double sizeCharge = 0;
        int days = 0;
        String level = "";

        
        if(speed.equals("Economy")){
            baseRate = 5;
            level = "Budget";
        }
        else if(speed.equals("Standard")){
            baseRate = 10;
            level = "Standard";
        }
        else if(speed.equals("Express")){
            baseRate = 25;
            level = "Priority";
        }
        else if(speed.equals("Overnight")){
            baseRate = 50;
            level = "Premium";
        }

        
        if(zone.equals("Local")){
            zoneMul = 1.0;
        }
        else if(zone.equals("Regional")){
            zoneMul = 1.2;
        }
        else if(zone.equals("National")){
            zoneMul = 1.5;
        }
        else if(zone.equals("International")){
            zoneMul = 3.0;
        }

       
        if(size.equals("Small")){
            sizeCharge = 0;
        }
        else if(size.equals("Medium")){
            sizeCharge = 5;
        }
        else if(size.equals("Large")){
            sizeCharge = 15;
        }
        else if(size.equals("Oversized")){
            sizeCharge = 30;
        }

      
        if(speed.equals("Economy")){
            if(zone.equals("Local")) days = 5;
            else if(zone.equals("Regional")) days = 7;
            else if(zone.equals("National")) days = 10;
            else days = 21;
        }
        else if(speed.equals("Standard")){
            if(zone.equals("Local")) days = 3;
            else if(zone.equals("Regional")) days = 5;
            else if(zone.equals("National")) days = 7;
            else days = 14;
        }
        else if(speed.equals("Express")){
            if(zone.equals("Local")) days = 1;
            else if(zone.equals("Regional")) days = 2;
            else if(zone.equals("National")) days = 2;
            else days = 5;
        }
        else if(speed.equals("Overnight")){
            days = 1;
        }

        double baseCost = (baseRate + weightCharge) * zoneMul;
        double total = baseCost + sizeCharge;

        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightCharge);
        System.out.println("Zone Multiplier: " + zoneMul + "x");
        System.out.println("Size Surcharge: $" + sizeCharge);
        System.out.println("Total Shipping Cost: $" + total);
        System.out.println("Estimated Delivery: " + days + " business days");
        System.out.println("Service Level: " + level);
    }
}
