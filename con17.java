import java.util.Scanner;

public class con17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();      
        String category = sc.nextLine();  
        double amount = sc.nextDouble();  
        sc.nextLine();
        String promo = sc.nextLine();     

        double base = 1.0;
        double catBonus = 1.0;
        double tierMul = 1.0;
        double promoMul = 1.0;

        
        if(category.equals("Groceries")){
            catBonus = 2.0;
        }
        else if(category.equals("Dining")){
            catBonus = 2.5;
        }
        else if(category.equals("Travel")){
            catBonus = 3.0;
        }
        else if(category.equals("Gas")){
            catBonus = 2.0;
        }
        else{
            catBonus = 1.0;
        }

       
        if(tier.equals("Basic")){
            tierMul = 1.0;
        }
        else if(tier.equals("Gold")){
            tierMul = 1.25;
        }
        else if(tier.equals("Platinum")){
            tierMul = 1.5;
        }
        else if(tier.equals("Black")){
            tierMul = 2.0;
        }

      
        if(promo.equals("None")){
            promoMul = 1.0;
        }
        else if(promo.equals("Double-Points")){
            promoMul = 2.0;
        }
        else if(promo.equals("Triple-Points")){
            promoMul = 3.0;
        }

        double points = amount * base * catBonus * tierMul * promoMul;
        double cash = points * 0.01;

        String rewardTier = "";

        if(tier.equals("Basic")){
            rewardTier = "Standard";
        }
        else if(tier.equals("Gold")){
            rewardTier = "Enhanced";
        }
        else if(tier.equals("Platinum")){
            rewardTier = "Premium";
        }
        else if(tier.equals("Black")){
            rewardTier = "Elite";
        }

        System.out.println("Card Tier: " + tier);
        System.out.println("Purchase Category: " + category);
        System.out.println("Transaction Amount: $" + amount);
        System.out.println("Promotional Status: " + promo);
        System.out.println("Base Points Rate: " + base + " points per dollar");
        System.out.println("Category Bonus: " + catBonus + "x");
        System.out.println("Tier Multiplier: " + tierMul + "x");
        System.out.println("Promotional Multiplier: " + promoMul + "x");
        System.out.println("Points Earned: " + points);
        System.out.println("Equivalent Cash Value: $" + cash);
        System.out.println("Rewards Tier: " + rewardTier);
    }
}
