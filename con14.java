import java.util.Scanner;

public class con14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();    
        int months = sc.nextInt();        
        sc.nextLine();                  
        String access = sc.nextLine();    
        String addon = sc.nextLine();     

        double base = 0;
        int discount = 0;
        double accessFee = 0;
        double addonFee = 0;

   
        if (tier.equals("Basic"))
            base = 40;
        else if (tier.equals("Premium"))
            base = 80;
        else if (tier.equals("Elite"))
            base = 120;
        else
            base = 150;

        
        if (months == 1)
            discount = 0;
        else if (months == 6)
            discount = 10;
        else if (months == 12)
            discount = 15;
        else
            discount = 25;

       
        if (access.equals("Single-Location"))
            accessFee = 0;
        else if (access.equals("Regional"))
            accessFee = 20;
        else
            accessFee = 50;

     
        if (addon.equals("None"))
            addonFee = 0;
        else if (addon.equals("Personal-Training"))
            addonFee = 100;
        else if (addon.equals("Classes"))
            addonFee = 50;
        else
            addonFee = 200;

      
        double discountedBase = base - (base * discount / 100.0);
        double monthlyTotal = discountedBase + accessFee + addonFee;
        double contractTotal = monthlyTotal * months;

        // Savings
        double normalTotal = (base + accessFee + addonFee) * months;
        double savings = normalTotal - contractTotal;

      
        String category;

        if (tier.equals("Basic"))
            category = "Budget";
        else if (tier.equals("Premium"))
            category = "Standard";
        else if (tier.equals("Elite"))
            category = "Premium";
        else
            category = "Luxury";

     
        System.out.println("Membership Tier: " + tier);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + access);
        System.out.println("Add-Ons: " + addon);
        System.out.println("Base Monthly Fee: $" + base);
        System.out.println("Contract Discount: " + discount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addonFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);
    }
}
